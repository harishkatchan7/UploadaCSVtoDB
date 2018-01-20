package com.javasampleapproach.uploadfile.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name="code")
public class ThingsD {

	@Id
	@Column(name="code")
	String code;
	@Column(name="name")
	String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
