package com.nt.sbeans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.Data;
@Service("service")
@Data
public class EmployeeService {
private List<Employee> list=new ArrayList<Employee>();

public void setList(List<Employee> list) {
    this.list = list;
}
public void addIncrementSalary(Employee e)
{
	if(e.getDept().equalsIgnoreCase("hr"))
		e.setSalary(((e.getSalary()*10)+e.getSalary())/100);
	else if(e.getDept().equalsIgnoreCase("manager"))
	
		e.setSalary(((e.getSalary()*30)+e.getSalary())/100);		
	else if(e.getDept().equalsIgnoreCase("devloper"))
		e.setSalary(((e.getSalary()*50)+e.getSalary())/100);	
	else e.setSalary(((e.getSalary()*70)+e.getSalary())/100);	
	
	list.add(e);
}
public void print() {
	System.out.println("Emp list"+getList());
}
}
