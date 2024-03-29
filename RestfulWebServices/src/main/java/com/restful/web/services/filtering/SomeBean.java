package com.restful.web.services.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//Static filter
//@JsonIgnoreProperties(value = {"field1", "field2"})
// Dynamic Filter
@JsonFilter(value = "SomeBeanFilter")
public class SomeBean {
	
	private String field1;
	
	private String field2;
	
	//@JsonIgnore
	private String field3;
	
}
