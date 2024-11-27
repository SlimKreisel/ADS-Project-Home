package application;

import java.util.Scanner;

/**
 *File Name: Employee Class
 *Author: Khalid Roble
 *Student Number:C23727729
 *Description of the class: It contains the employee data with constructors, setter and getter methods,the method of the details
 */
public class Employee {
	private String employeeNumber; 
	private String name;
	private int years;
	private String trainingCourseName;
	
	public Employee() {
		
		this.employeeNumber = "";
		this.name = "";
		this.years = 0;
		this.trainingCourseName = "";
		
	}
	public Employee(String employeeNumber,String trainingCourseName ) {
		
		this.employeeNumber = employeeNumber;
		this.name = "";
		this.years = 0;
		this.trainingCourseName = trainingCourseName;
		
	}
	

	
	
	public Employee(String number,String name, int years, String courseName) {
		Scanner kreisel = new Scanner(System.in);
		do {
			
			if(years<5) {
				System.out.println("Experience need to be more than 5 years");
				years = kreisel.nextInt();
//				kreisel.nextLine();
			}
			else
				this.years = years;
			
		}while(years<5);
		
		if(!courseName.startsWith("FOOD")) {
			System.out.println("Invalid input. Training Course is set to ERROR !");
			courseName = "ERROR";
		}
		
		this.employeeNumber = number;
		this.name = name;
		this.trainingCourseName  = courseName;
		
	}

	public String getEmployeeNumber () {
		return this.employeeNumber;
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public int getYears() {
		return this.years;
		
	}
	
	public String getTrainingCourse() {
		return this.trainingCourseName;
	}
	
	
	public void setEmployeeNumber(String number) {
		this.employeeNumber = number;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setYears(int years) {
		this.years = years;
	}
	
	public void setTrainingCourse(String courseName) {
		this.trainingCourseName = courseName;
	}
	
	
	public String toString() {
		return"Employee number is "+this.employeeNumber+"\n\n"+
	    "Employee name is "+this.name+"\n\n"+
		"Employee worked for "+this.years+"\n\n"+
	    "Employee's training Course is "+this.trainingCourseName+"\n\n";
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if(this.employeeNumber.equalsIgnoreCase(e.getEmployeeNumber()))
		return true;
		else
			return false;
	}
	
	public boolean equalsCourse(Object o) {
		Employee e = (Employee) o;
		if(this.trainingCourseName.equalsIgnoreCase(e.getTrainingCourse()))
		return true;
		else
			return false;
	}

}
