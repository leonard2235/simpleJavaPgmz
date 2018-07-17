package main.java.test.Emp;

public class Salary {
	
	int salary;
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	int empId;
	
	public void salary(int salary, int empId)
	{
		this.salary = salary;
		this.empId = empId;
	}
	
	public int calculateSalary(){	
		return salary + 50000;	
	}

}
