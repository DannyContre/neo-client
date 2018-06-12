package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "estimated_diameter_min", "estimated_diameter_max" })
public class Feet {

	@JsonProperty("estimated_diameter_min")
	private Double estimatedDiameterMin;
	@JsonProperty("estimated_diameter_max")
	private Double estimatedDiameterMax;

	@JsonProperty("estimated_diameter_min")
	public Double getEstimatedDiameterMin() {
		return estimatedDiameterMin;
	}

	@JsonProperty("estimated_diameter_min")
	public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
		this.estimatedDiameterMin = estimatedDiameterMin;
	}

	@JsonProperty("estimated_diameter_max")
	public Double getEstimatedDiameterMax() {
		return estimatedDiameterMax;
	}

	@JsonProperty("estimated_diameter_max")
	public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
		this.estimatedDiameterMax = estimatedDiameterMax;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nestimatedDiameterMin", estimatedDiameterMin)
				.append("\nestimatedDiameterMax", estimatedDiameterMax)
				.toString();
	}

}