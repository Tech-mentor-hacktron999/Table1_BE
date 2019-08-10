package com.dbs.table1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@CrossOrigin(origins = "*")
public class Table1Application {

	public static void main(String[] args) {
		SpringApplication.run(Table1Application.class, args);
	}

}
