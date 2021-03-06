package com.lts.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "studentmongo")
@TypeAlias("Student")

public class Student {
	
	@Id
	int studentId;
	String name;
	String department;
	int age;
	@Autowired
	Address address;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(int studentId, String name, String department, int age, Address address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.age = age;
		this.address = address;
	}



	public int getStudId() {
		return studentId;
	}
	public void setStudId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentId + ", name=" + name + ", department=" + department + ", age=" + age + ", address="
				+ address + "]";
	}
	
}
