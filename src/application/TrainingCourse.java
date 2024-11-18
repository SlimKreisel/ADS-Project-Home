package application;
import java.util.Scanner;

import util.LinkedList;
public class TrainingCourse {
	LinkedList<Employee> linkList;
	
	public TrainingCourse() {
		linkList = new LinkedList<>();
		
		
	}
	
	public void inputEmployee() {
		Scanner kreisel = new Scanner(System.in);
		
		String employeeNumber ="";
		String name  = "";
		int year = 0;
		String courseName = "";
		
		int count = 0;
		final int inputMax = 10;
		
		System.out.print("How many Employees would you liked to input ?");
		count = kreisel.nextInt();
		
		do {
			System.out.println("\nGive the employee a number ID: ");
			employeeNumber = kreisel.nextLine();
			System.out.println("\nEnter the name of the employee: ");
			name = kreisel.nextLine();
			
			try {
				
				System.out.println("\nEnter the year of experience that the employee has: ");
				year = kreisel.nextInt();
			}catch(Exception e) {
				System.out.println("Invalid value put in a number");
			}
			
			
			kreisel.nextLine();
		}while(count<=10);
		
		
		
		
		
	}
	
	public void displayEmployee() {
		System.out.println("\nDisplaying all Books....");
		System.out.println(linkList.toString()); 
	}
	
	public void removeEmployee() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
