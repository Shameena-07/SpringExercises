package com.sample.student.entity;



import org.springframework.stereotype.Component;

import jakarta.persistence.*;


@Entity
public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private String s_class;
	private String age;
	
	public StudentEntity() {
		
	}
	
	public StudentEntity(Integer id, String name, String address, String s_class, String age) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.s_class = s_class;
		this.age = age;
	}

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getS_class() {
		return s_class;
	}


	public void setS_class(String s_class) {
		this.s_class = s_class;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	
}
