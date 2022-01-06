package com.nec;

import com.nec.entity.Company;
import com.nec.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NecApplication implements CommandLineRunner
{
	@Autowired
	CompanyRepo cr;
	public static void main(String[] args)
	{
		SpringApplication.run(NecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		cr.save(new Company("Abc", 5000));
		cr.save(new Company("Pqr", 6000));
		cr.save(new Company("Xyz", 7000));


	}
}
