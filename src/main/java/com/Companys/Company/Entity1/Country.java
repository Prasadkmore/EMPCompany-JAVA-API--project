package com.Companys.Company.Entity1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int c_id;
	String c_name;
	
	
	public Country() {
		
	}
	
	public Country(int c_id,String c_name) {
		
		this.c_id = c_id;
		this.c_name = c_name;
	}
	
	
	public void setc_id(int c_id) {
		
		this.c_id = c_id;
	}
	public int getc_id() {
		return c_id;
	}
	
	public void setc_name(String c_name) {
		
		this.c_name = c_name;
	}
	public String getc_name() {
		
		return c_name;
	}
	
	public String toStrign() {
		
		
		return "[c_id ="+c_id+",c_name="+c_name+"]";
		
		
		
	}
	
}
