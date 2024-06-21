package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("emp")
@Scope("prototype")
public class Employee {
private int id;
private String name;
private String dept;
private double salary;

}
