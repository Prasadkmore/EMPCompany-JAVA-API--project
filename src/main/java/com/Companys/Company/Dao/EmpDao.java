package com.Companys.Company.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Companys.Company.Entity2.Employees;

@Repository
public class EmpDao {

	@Autowired
	SessionFactory factory;
	
	public String  insData(Employees e) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();;
		session.close();
		
		return "Data added";
		
	}
	
	public String upData(int e_id,Employees e) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employees employees = session.get(Employees.class, e_id);
		
		employees.setE_name(e.getE_name());
		employees.setE_phone(e.getE_phone());
		employees.setE_mailid(e.getE_mailid());
		employees.setE_status(e.getE_status());
		employees.setE_department(e.getE_department());
		employees.setCreatedby(e.getCreatedby());
		employees.setUpdatedby(e.getUpdatedby());
		employees.setCountry(e.getCountry());
		
		session.merge(employees);
		
		
		
		session.getTransaction().commit();;
		session.close();
		
		return "Data update";
		
	}
	
	public Employees getData(int e_id) {
		
		Session session = factory.openSession();
		session.beginTransaction();
	
		String sql ="from Employees where e_id=:myid";
		
		Query<Employees> query = session.createQuery(sql, Employees.class);
		
		query.setParameter("myid", e_id);
		
		Employees emp = query.uniqueResult();
		
		session.getTransaction().commit();;
		session.close();
		
		return emp;
		
	}
	
	public List<Employees> getallData() {
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		String sql = "from Employees";
		
		Query<Employees> emp = session.createQuery(sql, Employees.class);
		
		List<Employees> list = emp.getResultList();
		
		session.getTransaction().commit();;
		session.close();
	
		
		return list;
		
			
		
	}
	
	
	public String deleteData(int e_id) {
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employees emp = session.get(Employees.class, e_id);
		
		session.remove(emp);
		
		session.getTransaction().commit();;
		session.close();
		
		return "Data deleted";
		
	}
	
}
