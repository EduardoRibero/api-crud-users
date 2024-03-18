package com.example.demo.dtos;

import java.util.Objects;

import com.example.demo.entities.Users;

public class UsersDTO {
	
	private Long id;
	private String name;
	private String email;
	
	public UsersDTO() {
		
	}

	public UsersDTO(Users user) {
		id = user.getId();
		name = user.getName();
		email = user.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		UsersDTO other = (UsersDTO) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
