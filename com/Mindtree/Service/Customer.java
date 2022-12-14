package com.Mindtree.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	@Id
   private int id;
	@Column(name="Emp_Name")
   private String name;
   @Column(name="Age")
   private int age;
public Customer(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", age=" + age + "]";
}
   
}
