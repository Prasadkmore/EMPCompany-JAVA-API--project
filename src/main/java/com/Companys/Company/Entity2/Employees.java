package com.Companys.Company.Entity2;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import com.Companys.Company.Entity1.Country;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int e_id;
	String e_name;
	String e_phone;
	String e_mailid;
	String e_status;
	String e_department;
	@CreationTimestamp
	Date createdDate;
	@CreatedBy
	String createdby;
	@LastModifiedBy
	String updatedby;
	@UpdateTimestamp
	Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name = "c_id")
	Country country; 
	
	public Employees() {
		
	}

	public Employees(int e_id, String e_name, String e_phone, String e_mailid, String e_status, String e_department,
			Date createdDate, String createdby, String updatedby, Date updatedDate, Country country) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.e_phone = e_phone;
		this.e_mailid = e_mailid;
		this.e_status = e_status;
		this.e_department = e_department;
		this.createdDate = createdDate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.updatedDate = updatedDate;
		this.country = country;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_phone() {
		return e_phone;
	}

	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}

	public String getE_mailid() {
		return e_mailid;
	}

	public void setE_mailid(String e_mailid) {
		this.e_mailid = e_mailid;
	}

	public String getE_status() {
		return e_status;
	}

	public void setE_status(String e_status) {
		this.e_status = e_status;
	}

	public String getE_department() {
		return e_department;
	}

	public void setE_department(String e_department) {
		this.e_department = e_department;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employees [e_id=" + e_id + ", e_name=" + e_name + ", e_phone=" + e_phone + ", e_mailid=" + e_mailid
				+ ", e_status=" + e_status + ", e_department=" + e_department + ", createdDate=" + createdDate
				+ ", createdby=" + createdby + ", updatedby=" + updatedby + ", updatedDate=" + updatedDate
				+ ", country=" + country + "]";
	}
	
	
	
	
	
	
	
}
