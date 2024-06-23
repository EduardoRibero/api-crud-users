package com.example.demo.dtos;

import java.util.Objects;

import com.example.demo.entities.Users;

public class UsersRequestDTO {
	
	
	private String name;
	private String email;
	private String cpf;
	private String password;
	private Integer age;
	
	public UsersRequestDTO() {
		
	}

	public UsersRequestDTO(Users user) {
		
		this.name = user.getName();
		this.email = user.getEmail();
		this.cpf = user.getCpf();
		this.password = user.getPassword();
		this.age = user.getAge();
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
