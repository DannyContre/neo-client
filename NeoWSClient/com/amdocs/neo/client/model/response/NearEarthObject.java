package com.amdocs.neo.client.model.response;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ 
	"links", 
	"neo_reference_id", 
	"name", "nasa_jpl_url", 
	"absolute_magnitude_h", 
	"estimated_diameter",
	"is_potentially_hazardous_asteroid", 
	"close_approach_data", 
	"orbital_data" })
public class NearEarthObject {

	@JsonProperty("links")
	private Links_ links;
	@JsonProperty("neo_reference_id")
	private String neoReferenceId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("nasa_jpl_url")
	private String nasaJplUrl;
	@JsonProperty("absolute_magnitude_h")
	private Double absoluteMagnitudeH;
	@JsonProperty("estimated_diameter")
	private EstimatedDiameter estimatedDiameter;
	@JsonProperty("is_potentially_hazardous_asteroid")
	private Boolean isPotentiallyHazardousAsteroid;
	@JsonProperty("close_approach_data")
	private List<CloseApproachDatum> closeApproachData = null;
	@JsonProperty("orbital_data")
	private OrbitalData orbitalData;

	@JsonProperty("links")
	public Links_ getLinks() {
		return links;
	}

	@JsonProperty("links")
	public void setLinks(Links_ links) {
		this.links = links;
	}

	@JsonProperty("neo_reference_id")
	public String getNeoReferenceId() {
		return neoReferenceId;
	}

	@JsonProperty("neo_reference_id")
	public void setNeoReferenceId(String neoReferenceId) {
		this.neoReferenceId = neoReferenceId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("nasa_jpl_url")
	public String getNasaJplUrl() {
		return nasaJplUrl;
	}

	@JsonProperty("nasa_jpl_url")
	public void setNasaJplUrl(String nasaJplUrl) {
		this.nasaJplUrl = nasaJplUrl;
	}

	@JsonProperty("absolute_magnitude_h")
	public Double getAbsoluteMagnitudeH() {
		return absoluteMagnitudeH;
	}

	@JsonProperty("absolute_magnitude_h")
	public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
		this.absoluteMagnitudeH = absoluteMagnitudeH;
	}

	@JsonProperty("estimated_diameter")
	public EstimatedDiameter getEstimatedDiameter() {
		return estimatedDiameter;
	}

	@JsonProperty("estimated_diameter")
	public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
		this.estimatedDiameter = estimatedDiameter;
	}

	@JsonProperty("is_potentially_hazardous_asteroid")
	public Boolean getIsPotentiallyHazardousAsteroid() {
		return isPotentiallyHazardousAsteroid;
	}

	@JsonProperty("is_potentially_hazardous_asteroid")
	public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
		this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
	}

	@JsonProperty("close_approach_data")
	public List<CloseApproachDatum> getCloseApproachData() {
		return closeApproachData;
	}

	@JsonProperty("close_approach_data")
	public void setCloseApproachData(List<CloseApproachDatum> closeApproachData) {
		this.closeApproachData = closeApproachData;
	}

	@JsonProperty("orbital_data")
	public OrbitalData getOrbitalData() {
		return orbitalData;
	}

	@JsonProperty("orbital_data")
	public void setOrbitalData(OrbitalData orbitalData) {
		this.orbitalData = orbitalData;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nlinks", links)
				.append("\nneoReferenceId", neoReferenceId)
				.append("\nname", name)
				.append("\nnasaJplUrl", nasaJplUrl)
				.append("\nabsoluteMagnitudeH", absoluteMagnitudeH)
				.append("\nestimatedDiameter", estimatedDiameter)
				.append("\nisPotentiallyHazardousAsteroid", isPotentiallyHazardousAsteroid)
				.append("\ncloseApproachData", closeApproachData)
				.append("\norbitalData", orbitalData)
				.toString();
	}

}