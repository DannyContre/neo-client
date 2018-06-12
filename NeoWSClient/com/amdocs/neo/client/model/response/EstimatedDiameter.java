package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kilometers", "meters", "miles", "feet" })
public class EstimatedDiameter {

	@JsonProperty("kilometers")
	private Kilometers kilometers;
	@JsonProperty("meters")
	private Meters meters;
	@JsonProperty("miles")
	private Miles miles;
	@JsonProperty("feet")
	private Feet feet;

	@JsonProperty("kilometers")
	public Kilometers getKilometers() {
		return kilometers;
	}

	@JsonProperty("kilometers")
	public void setKilometers(Kilometers kilometers) {
		this.kilometers = kilometers;
	}

	@JsonProperty("meters")
	public Meters getMeters() {
		return meters;
	}

	@JsonProperty("meters")
	public void setMeters(Meters meters) {
		this.meters = meters;
	}

	@JsonProperty("miles")
	public Miles getMiles() {
		return miles;
	}

	@JsonProperty("miles")
	public void setMiles(Miles miles) {
		this.miles = miles;
	}

	@JsonProperty("feet")
	public Feet getFeet() {
		return feet;
	}

	@JsonProperty("feet")
	public void setFeet(Feet feet) {
		this.feet = feet;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nkilometers", kilometers)
				.append("meters", meters)
				.append("\nmiles", miles)
				.append("\nfeet", feet)
				.toString();
	}

}
