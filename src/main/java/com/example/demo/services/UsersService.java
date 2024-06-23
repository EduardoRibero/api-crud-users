package com.example.demo.services;

import java.util.List; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.UsersResponseDTO;
import com.example.demo.entities.Users;
import com.example.demo.repositores.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List <UsersResponseDTO> findAll(){
		List <Users> users = usersRepository.findAll();
		return users.stream().map(x -> new UsersResponseDTO(x)).toList();
	}
	
	public UsersResponseDTO salveUsers(Users users) {
		return new UsersResponseDTO(usersRepository.save(users));
	}
	
	public UsersResponseDTO findById(long id) {
		Users result = usersRepository.findById(id).get();
		UsersResponseDTO dto = new UsersResponseDTO(result);
		return dto;
	}
	
	public void deleteUsers(long id) {
		usersRepository.deleteById(id);
	}
	
	public UsersResponseDTO updateUser(long id, Users users) {
		Users user = usersRepository.findById(id).get();
		user.setName(users.getName());
		user.setEmail(users.getEmail());
		user.setId(id);
		usersRepository.save(user);
		return new UsersResponseDTO(user);
	}
	
	
}
