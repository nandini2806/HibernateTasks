package com.entity1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dept_id;
	private String deptName;
	@ManyToMany(mappedBy="dept")
	List<Employeee> emp;
	public List<Employeee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employeee> emp) {
		this.emp = emp;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Department(int dept_id, String deptName, List<Employeee> emp) {
		super();
		this.dept_id = dept_id;
		this.deptName = deptName;
		this.emp = emp;
	}
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", deptName=" + deptName + ", emp=" + emp + "]";
	}
	
	

}
