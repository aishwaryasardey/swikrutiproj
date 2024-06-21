package com.nt;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;
import com.nt.sbeans.EmployeeService;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class Day2Proj1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Day2Proj1Application.class, args);
		EmployeeService emp=ctx.getBean("service",EmployeeService.class);
		Employee e=ctx.getBean("emp",Employee.class);
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<2;i++) {
		System.out.println("enter the name");
		e.setName(sc.next());
		System.out.println("enter id");
		e.setId(sc.nextInt());
		System.out.println("enter dept");
		e.setDept(sc.next());
		System.out.println("enter salary");
		e.setSalary(sc.nextDouble());
		emp.addIncrementSalary(e);
		}
		emp.print();
	}

}
