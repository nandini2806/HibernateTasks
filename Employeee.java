package com.entity1;

import java.util.List;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

	@Entity
	public class Employeee {
			@Id
			private int emp_id;
			private String empName;
			private int empAge;
			@JoinTable(name="employeee_deparment",
					joinColumns=@JoinColumn(name="emp_id"),
					inverseJoinColumns=@JoinColumn(name="dept_id"))
			@ManyToMany
			List<Department> dept;
			public int getEmp_id() {
				return emp_id;
			}
			public void setEmp_id(int emp_id) {
				this.emp_id = emp_id;
			}
			public String getEmpName() {
				return empName;
			}
			public void setEmpName(String empName) {
				this.empName = empName;
			}
			public int getEmpAge() {
				return empAge;
			}
			public void setEmpAge(int empAge) {
				this.empAge = empAge;
			}
			
			
			public List<Department> getDept() {
				return dept;
			}
			public void setDept(List<Department> dept) {
				this.dept = dept;
			}
			public Employeee() {
				
			}
			public Employeee(int emp_id, String empName, int empAge, List<Department> dept) {
				super();
				this.emp_id = emp_id;
				this.empName = empName;
				this.empAge = empAge;
				this.dept = dept;
			}
			@Override
			public String toString() {
				return "Employeee [emp_id=" + emp_id + ", empName=" + empName + ", empAge=" + empAge + ", dept=" + dept
						+ "]";
			}
			
			
			
	


}
