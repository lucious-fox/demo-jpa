package com.example.kbvid.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kbvid.demo.persistence.Users;
import com.example.kbvid.demo.persistence.UsersRepository;

@SpringBootApplication
@RestController
public class DemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}
	
	@Autowired
	private UsersRepository repo;
	
	@RequestMapping("/users/{name}")
	public Users users( @PathVariable("name") String name)  {
		return repo.findByName(name);
	}
}
