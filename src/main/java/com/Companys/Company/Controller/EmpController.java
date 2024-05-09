package com.Companys.Company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Companys.Company.Entity2.Employees;
import com.Companys.Company.Service.EmpService;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService es;
	
	@PostMapping("/ins")
	public String insData(@RequestBody  Employees e) {
		
		String message = es.insData(e);
		
		return message;
	}
	
	@PutMapping("/up/{e_id}")
	public String upData(@PathVariable int e_id,@RequestBody Employees e) {
		
		String message =  es.upData(e_id, e);
		
		return message;
	}
	
	@GetMapping("/get/{e_id}")
	public Employees getData(@PathVariable  int e_id) {
		Employees emp = es.getData(e_id);
		
		return emp;
	}
	
	@GetMapping("/getall")
	public 	List<Employees> getallData(){
		
		List<Employees> list = es.getallData();
		return list;
	}
	
	@DeleteMapping("/del/{e_id}")
	public String deleteData( @PathVariable int e_id) {
		String message = es.deleteData(e_id);
		
		return message;
	}
	
}
