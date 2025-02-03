package com.bankapp;

import com.bankapp.entities.Account;
import com.bankapp.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class Bakapp01Application implements CommandLineRunner {

	@Autowired
	private AccountRepo accountRepo;


	public static void main(String[] args) {

		SpringApplication.run(Bakapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepo.save(new Account("Raju", new BigDecimal("5000.00")));
		accountRepo.save(new Account("Ravi", new BigDecimal("4000.00")));
	}


}
