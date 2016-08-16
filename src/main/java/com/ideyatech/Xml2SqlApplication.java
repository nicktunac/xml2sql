package com.ideyatech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ideyatech.domain.Company;
import com.ideyatech.repository.CompanyRepository;

@SpringBootApplication
public class Xml2SqlApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Xml2SqlApplication.class, args);
	}

}
