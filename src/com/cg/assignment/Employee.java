package com.cg.assignment;

	import java.util.LinkedHashMap;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Map;

	public class Employee {
		
			private String empId;
			private String empName;
			private String empDept;
			private double empSalary;
			
			// Default Constructor
			Employee() {
			}
			
			// Parameterized Constructor
			Employee(Object obj) {
				if(obj instanceof LinkedHashMap) {
					Map<String,Object> myMap = (LinkedHashMap<String,Object>) obj;
					this.empId = (String) myMap.get("empId");
					this.empName = (String) myMap.get("empName");
					this.empDept = (String) myMap.get("empDept");
					this.empSalary = (double) myMap.get("empSalary");
				}
				else {
					System.out.println("Null");
					return;
				}
			}

			// Getters and Setters
			public String getEmpId() {
				return empId;
			}
			public void setEmpId(String empId) {
				this.empId = empId;
			}
			public String getEmpName() {
				return empName;
			}
			public void setEmpName(String empName) {
				this.empName = empName;
			}
			public String getEmpDept() {
				return empDept;
			}
			public void setEmpDept(String empDept) {
				this.empDept = empDept;
			}
			public double getEmpSalary() {
				return empSalary;
			}
			public void setEmpSalary(double empSalary) {
				this.empSalary = empSalary;
			}
			
			
			public Object calculate() {
				
				double pf = 0.17*this.empSalary;
			
				double allowance = 0.15*this.empSalary;
				List<Double> myList = new LinkedList<>();
				myList.add(pf);
				myList.add(allowance);
				return myList;
			}
			
			public static void main(String[] args) {
				Map<String,Object> allValues = new LinkedHashMap<>();
				allValues.put("empId","EMP666");
				allValues.put("empName","Alex Turner");
				allValues.put("empDept", "Tax");
				allValues.put("empSalary",50000.0);
				
				Employee myEmployee = new Employee(allValues);
				List<Double> resultList = (List<Double>)myEmployee.calculate();
				
				System.out.println("ID : "+myEmployee.getEmpId());
				System.out.println("Name : "+myEmployee.getEmpName());
				System.out.println("Department : "+myEmployee.getEmpDept());
				System.out.println("Salary : Rs."+myEmployee.getEmpSalary());
				System.out.println("PF : Rs."+resultList.get(0));
				System.out.println("Allowance : Rs."+resultList.get(1));
			}
	}
