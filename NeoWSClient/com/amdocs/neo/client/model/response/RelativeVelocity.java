package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "kilometers_per_second", "kilometers_per_hour", "miles_per_hour" })
public class RelativeVelocity {

	@JsonProperty("kilometers_per_second")
	private String kilometersPerSecond;
	@JsonProperty("kilometers_per_hour")
	private String kilometersPerHour;
	@JsonProperty("miles_per_hour")
	private String milesPerHour;

	@JsonProperty("kilometers_per_second")
	public String getKilometersPerSecond() {
		return kilometersPerSecond;
	}

	@JsonProperty("kilometers_per_second")
	public void setKilometersPerSecond(String kilometersPerSecond) {
		this.kilometersPerSecond = kilometersPerSecond;
	}

	@JsonProperty("kilometers_per_hour")
	public String getKilometersPerHour() {
		return kilometersPerHour;
	}

	@JsonProperty("kilometers_per_hour")
	public void setKilometersPerHour(String kilometersPerHour) {
		this.kilometersPerHour = kilometersPerHour;
	}

	@JsonProperty("miles_per_hour")
	public String getMilesPerHour() {
		return milesPerHour;
	}

	@JsonProperty("miles_per_hour")
	public void setMilesPerHour(String milesPerHour) {
		this.milesPerHour = milesPerHour;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nkilometersPerSecond", kilometersPerSecond)
				.append("\nkilometersPerHour", kilometersPerHour)
				.append("\nmilesPerHour", milesPerHour)
				.toString();
	}
}
