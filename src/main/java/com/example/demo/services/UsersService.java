package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dtos.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.repositores.UsersRepository;


@Service
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List <UsersDTO> findAll(){
		List <Users> users = usersRepository.findAll();
		return users.stream().map(x -> new UsersDTO(x)).toList();
	}
	
	public UsersDTO salveUsers(Users users) {
		return new UsersDTO(usersRepository.save(users));
	}
	
	public UsersDTO findById(long id) {
		Users result = usersRepository.findById(id).get();
		UsersDTO dto = new UsersDTO(result);
		return dto;
	}
	
	public void deleteUsers(long id) {
		usersRepository.deleteById(id);
	}
	
	public UsersDTO updateUser(long id, Users users) {
		Users user = usersRepository.findById(id).get();
		user.setName(users.getName());
		user.setEmail(users.getEmail());
		user.setId(id);
		usersRepository.save(user);
		return new UsersDTO(user);
	}
	
	
}
