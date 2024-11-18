package application;

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
	
	public Employee(String number,String name, int years, String courseName) {
		this.employeeNumber = number;
		this.name = name;
		this.years = years;
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
	    "EMployee's trainig Course is "+this.trainingCourseName;
	}
	
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if(this.employeeNumber.equalsIgnoreCase(e.getEmployeeNumber()))
		return true;
		else
			return false;
	}
	

}
