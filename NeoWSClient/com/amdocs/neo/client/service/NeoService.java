package com.amdocs.neo.client.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import com.amdocs.neo.client.exception.NeoException;
import com.amdocs.neo.client.facade.NeoWebServiceConsumer;
import com.amdocs.neo.client.model.response.Browse;
import com.amdocs.neo.client.model.response.NearEarthObject;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NeoService {

	public NearEarthObject findLargestNeo() {
		NearEarthObject nearEarthObject = new NearEarthObject();

		try {
			nearEarthObject = retrieveNeos().stream()
			.max(Comparator.comparingDouble(neo -> neo.getEstimatedDiameter().getKilometers().getEstimatedDiameterMax()))
			.orElseThrow(NoSuchElementException::new);
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}

		return nearEarthObject;
	}

	public NearEarthObject findClosestToEarthNeo() {
		List<NearEarthObject> neoList = retrieveNeos();

		List<NearEarthObject> neoListWithCloseAprocheData = neoList.stream()
				.filter(neo -> !neo.getCloseApproachData().isEmpty()).collect(Collectors.toList());

		Optional<NearEarthObject> neoOptional = neoListWithCloseAprocheData.stream()
				.min(Comparator.comparingDouble(neo -> new Double(neo.getCloseApproachData().stream()
				.min(Comparator.comparingDouble(closeAprocheData -> new Double(closeAprocheData.getMissDistance().getLunar())))
				.get().getMissDistance().getLunar())));

		return neoOptional.get();
	}

	public Long getTotalNumberOfNeo() {
		return retrieveNeos().stream().count();
	}

	private List<NearEarthObject> retrieveNeos() {
		Browse browse = new Browse();
		List<NearEarthObject> nearEarthObjectList = new ArrayList<>();
		ObjectMapper objectMapper = new ObjectMapper();
		
		String response = new NeoWebServiceConsumer().retrieveNeos();

		try {
			browse = objectMapper.readValue(response, Browse.class);

		} catch (JsonMappingException e) {
			throw new NeoException("Json-001",e.getLocalizedMessage());
		} catch (JsonParseException e) {
			throw new NeoException("Json-002",e.getLocalizedMessage());
		} catch (IOException e) {
			throw new NeoException("Json-003",e.getLocalizedMessage());
		}

		nearEarthObjectList = browse.getNearEarthObjects();
		return nearEarthObjectList;
	}
}