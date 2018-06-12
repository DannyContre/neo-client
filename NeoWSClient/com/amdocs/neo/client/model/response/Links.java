package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "next", "self" })
public class Links {

	@JsonProperty("next")
	private String next;
	@JsonProperty("self")
	private String self;

	@JsonProperty("next")
	public String getNext() {
		return next;
	}

	@JsonProperty("next")
	public void setNext(String next) {
		this.next = next;
	}

	@JsonProperty("self")
	public String getSelf() {
		return self;
	}

	@JsonProperty("self")
	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nnext", next)
				.append("\nself", self)
				.toString();
	}
}
