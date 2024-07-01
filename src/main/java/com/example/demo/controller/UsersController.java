package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.dtos.UsersDTO;
import com.example.demo.entities.Users;
import com.example.demo.services.UsersService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value="/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List <UsersDTO> findAll(){
		List <UsersDTO> result = usersService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") 
	public UsersDTO findById(@PathVariable long id) {
		UsersDTO result = usersService.findById(id);
		return result;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping
	public UsersDTO postUsers(@RequestBody Users users) {
		UsersDTO dto = usersService.salveUsers(users);
		return dto;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@DeleteMapping(value = "/{id}")
	public boolean deleteUsers(@PathVariable long id) {
			usersService.deleteUsers(id);
			return true;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PutMapping(value = "/{id}")
	public UsersDTO update(@PathVariable long id, @RequestBody Users users) {
		return usersService.updateUser(id, users);
	}
}
