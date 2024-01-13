package com.strutsDemo.model;

public class Person {

	private String name;
	private String id;
	private String age;
	private String place;
	
	
	
	public Person(String id, String name, String place, String age) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.place = place;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		return "Person: [personId=" + id + ", personName=" + name + ", personPlace=" + place + ", age="
				+ age + "]";
	}
	
}
