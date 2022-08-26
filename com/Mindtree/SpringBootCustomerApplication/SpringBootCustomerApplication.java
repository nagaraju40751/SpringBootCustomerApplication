package com.Mindtree.SpringBootCustomerApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Service.Customer;

@SpringBootApplication
@RestController
public class SpringBootCustomerApplication {
	@GetMapping("/Cutomer")
	public String diaplay()
	{
		
		return "The Customer details are";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootCustomerApplication.class, args);
		List<Customer> customer=new ArrayList<>();
		customer.add(new Customer(101,"Gopi",25000));
		customer.add(new Customer(102,"naga",30000));
		customer.add(new Customer(103,"Raj",23000));
		customer.add(new Customer(104,"Siva",23000));
		customer.add(new Customer(105,"Pavan",23000));
		customer.add(new Customer(106,"Rakesh",23000));
		customer.add(new Customer(107,"vamsi",23000));
		customer.add(new Customer(108,"Raj",23000));
		customer.add(new Customer(109,"Raj",23000));
		customer.add(new Customer(110,"Raj",23000));
		System.out.println("Enter customer id whose details you want!!!!!!");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();	
		boolean b=false;
		for(Customer c:customer)
		{
			if(c.getId()==a)
			{
				System.out.println("Customer Name :"+c.getName()+"/n"+"Age :"+c.getAge());
				b=true;
			}
			if(b==false)
			{
			throw new Exception("Invalid Custome Id Provided!!!!!");
			}
		}
	}
	}


