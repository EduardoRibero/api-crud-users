package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.dtos.UsersRequestDTO;
import com.example.demo.dtos.UsersResponseDTO;
import com.example.demo.entities.Users;
import com.example.demo.services.UsersService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping(value="/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping
	public List <UsersResponseDTO> findAll(){
		List <UsersResponseDTO> result = usersService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") 
	public UsersResponseDTO findById(@PathVariable long id) {
		UsersResponseDTO result = usersService.findById(id);
		return result;
	}
	
	@PostMapping
	public UsersResponseDTO postUsers(@RequestBody UsersRequestDTO users) {
		Users dto = new Users(users);
		return usersService.salveUsers(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean deleteUsers(@PathVariable long id) {
		try {
			usersService.deleteUsers(id);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	@PutMapping(value = "/{id}")
	public UsersResponseDTO update(@PathVariable long id, @RequestBody Users users) {
		return usersService.updateUser(id, users);
	}
}
