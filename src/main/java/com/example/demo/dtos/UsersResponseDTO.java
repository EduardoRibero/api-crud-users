package com.example.demo.dtos;

import java.util.Objects;

import com.example.demo.entities.Users;

public class UsersResponseDTO {
	
	private Long id;
	private String name;
	private String email;
	private String cpf;
	private Integer age;
	
	public UsersResponseDTO() {
		
	}

	public UsersResponseDTO(Users user) {
		this.id = user.getId();
		this.name = user.getName();
		this.email = user.getEmail();
		this.age = user.getAge();
		this.cpf = user.getCpf();
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersResponseDTO other = (UsersResponseDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
