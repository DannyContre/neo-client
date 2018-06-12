package com.amdocs.neo.client.model.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "size", "total_elements", "total_pages", "number" })
public class Page {

	@JsonProperty("size")
	private Integer size;
	@JsonProperty("total_elements")
	private Integer totalElements;
	@JsonProperty("total_pages")
	private Integer totalPages;
	@JsonProperty("number")
	private Integer number;

	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	@JsonProperty("total_elements")
	public Integer getTotalElements() {
		return totalElements;
	}

	@JsonProperty("total_elements")
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	@JsonProperty("total_pages")
	public Integer getTotalPages() {
		return totalPages;
	}

	@JsonProperty("total_pages")
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty("number")
	public Integer getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(null)
				.append("\nsize", size)
				.append("\ntotalElements", totalElements)
				.append("\ntotalPages", totalPages)
				.append("\nnumber", number)
				.toString();
	}

}
