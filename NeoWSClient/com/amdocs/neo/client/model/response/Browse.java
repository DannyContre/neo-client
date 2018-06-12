package com.amdocs.neo.client.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "links", "page", "near_earth_objects" })
public class Browse {

	@JsonProperty("links")
	private Links links;
	@JsonProperty("page")
	private Page page;
	@JsonProperty("near_earth_objects")
	private List<NearEarthObject> nearEarthObjects = null;

	@JsonProperty("links")
	public Links getLinks() {
		return links;
	}

	@JsonProperty("links")
	public void setLinks(Links links) {
		this.links = links;
	}

	@JsonProperty("page")
	public Page getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(Page page) {
		this.page = page;
	}

	@JsonProperty("near_earth_objects")
	public List<NearEarthObject> getNearEarthObjects() {
		return nearEarthObjects;
	}

	@JsonProperty("near_earth_objects")
	public void setNearEarthObjects(List<NearEarthObject> nearEarthObjects) {
		this.nearEarthObjects = nearEarthObjects;
	}

}
