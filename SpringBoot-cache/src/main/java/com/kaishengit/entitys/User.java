package com.kaishengit.entitys;

public class User {

	private Integer id;
	private Integer age;
	private String name;
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
