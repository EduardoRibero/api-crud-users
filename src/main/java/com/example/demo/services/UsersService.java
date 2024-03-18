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
	
	public Users salveUsers(Users users) {
		return usersRepository.save(users);
	}
}
