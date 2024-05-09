package com.Companys.Company.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Companys.Company.Dao.EmpDao;
import com.Companys.Company.Entity2.Employees;

@Service
public class EmpService {

	@Autowired
	EmpDao ed;
	
	
	public String  insData(Employees e) {
		
		String message = ed.insData(e);
		
		return message;
	}
	
	public String upData(int e_id, Employees e) {
		
		String message = ed.upData(e_id, e);
		
		return message;
	}
	
	public Employees getData(int e_id) {
		
		Employees emp = ed.getData(e_id);
		
		return emp;
	}
	
	public 	List<Employees>  getallData() {
		
		List<Employees> list = ed.getallData();
		
		return list;
		
	}
	
	public String deleteData(int e_id) {
		
		String message = ed.deleteData(e_id);
		
		return message;
	}
	
	
	
	
	
}
