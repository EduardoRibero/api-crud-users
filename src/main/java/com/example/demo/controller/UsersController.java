package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.dtos.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.services.UsersService;

@RestController
@RequestMapping(value="/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping
	public List <UsersDTO> findAll(){
		List <UsersDTO> result = usersService.findAll();
		return result;
	}
	
	@PostMapping
	public Users postUsers(@RequestBody Users users) {
		return usersService.salveUsers(users);
	}
}
