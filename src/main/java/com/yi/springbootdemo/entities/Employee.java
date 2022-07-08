package com.yi.springbootdemo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

	private Integer id;
    private String lastName;
    private String email;
    //1 male, 0 female
    private Integer gender;
    private Integer d_id;
    private Department department;
    private Date birth;
	
	
}
