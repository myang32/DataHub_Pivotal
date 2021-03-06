package com.example.managerdataservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	private long manager;



	protected Employee() {

	}

	public Employee(String name, String role, long manager) {
		super();
		this.name = name;
		this.role = role;
		this.manager = manager;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	
	public long getManager() {
		return manager;
	}

	public void setManager(long manager) {
		this.manager = manager;
	}

	/*@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, role=%s]", id, name, role);
	}*/
}
