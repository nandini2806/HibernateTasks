package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employee {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int emp_id;
		private String empName;
		private String empDepartment;
		private int empAge;
		private int salary;
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
		public String getEmpDepartment() {
			return empDepartment;
		}
		public void setEmpDepartment(String empDepartment) {
			this.empDepartment = empDepartment;
		}
		public int getEmpAge() {
			return empAge;
		}
		public void setEmpAge(int empAge) {
			this.empAge = empAge;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Employee(int emp_id, String empName, String empDepartment, int empAge, int salary) {
			super();
			this.emp_id = emp_id;
			this.empName = empName;
			this.empDepartment = empDepartment;
			this.empAge = empAge;
			this.salary = salary;
		}
		public Employee() {
			
		}
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", empName=" + empName + ", empDepartment=" + empDepartment
					+ ", empAge=" + empAge + ", salary=" + salary + "]";
		}
		

}
