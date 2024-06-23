package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.demo.repositores.UsersRepository;

@DataJpaTest
@ActiveProfiles("test")
public class UsersRepositoryTest {
	@Autowired
	UsersRepository usersRp;	
	
	
	@Test
	@DisplayName("Alguma legenda do metodo de test?")
	void findUsers() {
		
	}
}
