package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ 
	"close_approach_date", 
	"epoch_date_close_approach", 
	"relative_velocity", 
	"miss_distance",
	"orbiting_body" })

public class CloseApproachDatum {

	@JsonProperty("close_approach_date")
	private String closeApproachDate;
	@JsonProperty("epoch_date_close_approach")
	private Double epochDateCloseApproach;
	@JsonProperty("relative_velocity")
	private RelativeVelocity relativeVelocity;
	@JsonProperty("miss_distance")
	private MissDistance missDistance;
	@JsonProperty("orbiting_body")
	private String orbitingBody;

	@JsonProperty("close_approach_date")
	public String getCloseApproachDate() {
		return closeApproachDate;
	}

	@JsonProperty("close_approach_date")
	public void setCloseApproachDate(String closeApproachDate) {
		this.closeApproachDate = closeApproachDate;
	}

	@JsonProperty("epoch_date_close_approach")
	public Double getEpochDateCloseApproach() {
		return epochDateCloseApproach;
	}

	@JsonProperty("epoch_date_close_approach")
	public void setEpochDateCloseApproach(Double epochDateCloseApproach) {
		this.epochDateCloseApproach = epochDateCloseApproach;
	}

	@JsonProperty("relative_velocity")
	public RelativeVelocity getRelativeVelocity() {
		return relativeVelocity;
	}

	@JsonProperty("relative_velocity")
	public void setRelativeVelocity(RelativeVelocity relativeVelocity) {
		this.relativeVelocity = relativeVelocity;
	}

	@JsonProperty("miss_distance")
	public MissDistance getMissDistance() {
		return missDistance;
	}

	@JsonProperty("miss_distance")
	public void setMissDistance(MissDistance missDistance) {
		this.missDistance = missDistance;
	}

	@JsonProperty("orbiting_body")
	public String getOrbitingBody() {
		return orbitingBody;
	}

	@JsonProperty("orbiting_body")
	public void setOrbitingBody(String orbitingBody) {
		this.orbitingBody = orbitingBody;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\ncloseApproachDate", closeApproachDate)
				.append("\nepochDateCloseApproach", epochDateCloseApproach)
				.append("\nrelativeVelocity", relativeVelocity)
				.append("\nmissDistance", missDistance)
				.append("\norbitingBody", orbitingBody)
				.toString();
	}
}
