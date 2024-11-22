package application;

/**
 *File Name:
 *Author: Khalid Roble
 *Student Number:C23727729
 *Description of the class:
 */
import java.util.Scanner;

import util.LinkedList;

public class TrainingCourse {
	LinkedList<Employee> linkList;

	public TrainingCourse() {
		linkList = new LinkedList<>();
		//inputEmployee();
		linkList.add(new Employee("C1","Slim", 5,"Food"));
		linkList.add(new Employee("K","S", 6,"Gara"));
		linkList.add(new Employee("C1","F", 7,"Food"));
		linkList.add(new Employee("K","G", 8,"Gara"));
		linkList.add(new Employee("C1","T", 9,"Food"));
		displayEmployee();
		
		//removeEmployee();
		//displayEmployee();
		removeTrainingCourse();
		displayEmployee();

	}

	public void inputEmployee() {
		Scanner kreisel = new Scanner(System.in);

		String employeeNumber = "";
		String name = "";
		int year = 0;
		String courseName = "";

		int count = 0;
		int inputnumEmp = 0;

		Employee employ = null;

		System.out.print("How many Employees would you liked to input ?");
		inputnumEmp = kreisel.nextInt();
		kreisel.nextLine();
		if (inputnumEmp >= 10 || inputnumEmp <= 0) {
			System.out.println("ERROR, Number must be between 0-10");

		} else {
			for (int i = 0; i < inputnumEmp; i++) {

				System.out.println("\nGive the employee a number ID: ");
				employeeNumber = kreisel.nextLine();
				System.out.println("\nEnter the name of the employee: ");
				name = kreisel.nextLine();

				try {

					System.out.println("\nEnter the year of experience that the employee has: ");
					year = kreisel.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid value put in a number");
				}

				kreisel.nextLine();

				System.out.println("\nEnter the name of the Training Course: ");
				courseName = kreisel.nextLine();

				employ = new Employee(employeeNumber, name, year, courseName);

				linkList.add(employ);
			}

		}

	}

	public void displayEmployee() {
		System.out.println("\nDisplaying all Books....");
		System.out.println(linkList.toString());
	}

	public void removeEmployee() {
		Scanner kreisel = new Scanner(System.in);
		String removeNumber = "";

		Employee removeEmpNumber = null;

		System.out.println("Enter the employee number that you want to remove!");
		removeNumber = kreisel.nextLine();

		removeEmpNumber = new Employee(removeNumber, "", 0, "");

		if (linkList.isEmpty()) {
			System.out.println("The List is empty");
		} else {
			if (linkList.contains(removeEmpNumber)) {
				linkList.removeEverything(removeEmpNumber);
			}
		}

	}

	public void removeTrainingCourse() {
		Scanner kreisel = new Scanner(System.in);
		String courseNumber = "";
		int count = 0;
		boolean check = false;
		Employee removeTrainingCourse = null;

		System.out.println("Enter the trainingCourse that you want to remove!");
//		courseNumber = kreisel.nextLine();
		courseNumber = "Gara";
		removeTrainingCourse = new Employee("", "", 0, courseNumber);

		/**
		 * if(linkList.isEmpty()) { System.out.println("The List is empty"); }
		 */
		 
			do {
				
			

			for (int i = linkList.size(); i >= 0 && linkList.get(i)!=null && linkList.get(i).equalsCourse(removeTrainingCourse); i--)
				count = i;
				
				
			System.out.println("Count is :"+count);

			if (linkList.get(count).equalsCourse(removeTrainingCourse)) {
				
				removeTrainingCourse = new Employee("", "", 0, courseNumber);
				removeTrainingCourse = linkList.get(count);
				linkList.removeEverything(removeTrainingCourse);
				check =true;
			}
			}while(check==true );

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingCourse course = new TrainingCourse();

	}

}
