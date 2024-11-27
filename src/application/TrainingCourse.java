package application;

/**
 *File Name: TrainingCourse
 *Author: Khalid Roble
 *Student Number:C23727729
 *Description of the class:It carry out the main function as listed above
 */
import java.util.Scanner;

import util.LinearNode;
import util.LinkedList;

public class TrainingCourse {
	LinkedList<Employee> linkList;

	public TrainingCourse() {
		linkList = new LinkedList<>();
//	inputEmployee();
		linkList.add(new Employee("C1", "Slim", 5, "FOOD"));
		linkList.add(new Employee("K", "S", 6, "FOOD"));
		linkList.add(new Employee("C1", "F", 7, "FOOD"));
		linkList.add(new Employee("K", "G", 8, "FOOD"));
		linkList.add(new Employee("C1", "T", 9, "FOOD"));
		displayEmployee();
		addOneMoreEmployee();
		displayEmployee();
		removeEmployee();
		displayEmployee();
		removeTrainingCourse();
		displayEmployee();

	}

	public void inputEmployee() {
		Scanner kreisel = new Scanner(System.in);

		String employeeNumber = "";
		String name = "";
		int year = 0;
		String courseName = "";
		int count = 1;
		int inputnumEmp = 0;
		boolean check = false;
		Employee employ = null;

		System.out.print("How many Employees would you liked to input ?");
		inputnumEmp = kreisel.nextInt();
		kreisel.nextLine();
		if (inputnumEmp >= 10 || inputnumEmp <= 0) {
			System.out.println("ERROR, Number must be between 0-10");

		} else {
			for (int i = 0; i < inputnumEmp; i++) {

				System.out.println("\nGive the employee a number ID: " + count);
				employeeNumber = kreisel.nextLine();
				System.out.println("\nEnter the name of the employee: " + count);
				name = kreisel.nextLine();

				System.out.println("\nEnter the year of experience that the employee has: " + count);
				try {

					year = kreisel.nextInt();
					kreisel.nextLine();

				} catch (Exception e) {
					System.out.println("Invalid value put in a number");
					kreisel.nextLine();

				}

				System.out.println("\nEnter the name of the Training Course: " + count);
				courseName = kreisel.nextLine();

				employ = new Employee(employeeNumber, name, year, courseName);

				linkList.add(employ);

				count++;
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
		boolean checkNumber = false;
		int count = 0;
		Employee removeEmpNumber = null;

		System.out.println("Enter the employee number that you want to remove!");
		removeNumber = kreisel.nextLine();

		removeEmpNumber = new Employee(removeNumber,"");

		if (linkList.isEmpty()) {
			System.out.println("The List is empty");
		} else {
			do {
				checkNumber = false;
				for (count = linkList.size() - 1; count >= 0 && linkList.get(count) != null
						&& !linkList.get(count).equals(removeEmpNumber); count--)
					;

				if (linkList.get(count) != null) {
					linkList.removeEverything(removeEmpNumber);
					checkNumber = true;
				}
			} while (checkNumber == true);

		}

	}

	public void removeTrainingCourse() {

		Scanner kreisel = new Scanner(System.in);
		String courseNumber = "";
		int count = 0;
		boolean check = false;
		Employee removeTrainingCourse = null;

		System.out.println("Enter the trainingCourse that you want to remove!");

		courseNumber = kreisel.nextLine();

		removeTrainingCourse = new Employee("", courseNumber);


		do {
			check = false;

			for (count = linkList.size() - 1; count >= 0 && linkList.get(count) != null
					&& !linkList.get(count).equalsCourse(removeTrainingCourse); count--)
				;

			if (linkList.get(count) != null) {

				removeTrainingCourse = linkList.get(count);

				linkList.removeEverything(removeTrainingCourse);

				check = true;

			}

		} while (check == true);
		
	}
	
	

	public void addOneMoreEmployee() {
		Scanner kreisel = new Scanner(System.in);

		String employeeNumber = "";
		String name = "";
		int year = 0;
		String courseName = "";
		Employee employPosition = null;
		int position = 0;

		System.out.println("\nGive the employee a number ID: ");
		employeeNumber = kreisel.nextLine();
		System.out.println("\nEnter the name of the employee: ");
		name = kreisel.nextLine();

		System.out.println("\nEnter the year of experience that the employee has: ");
		try {

			year = kreisel.nextInt();
			kreisel.nextLine();

		} catch (Exception e) {
			System.out.println("Invalid value put in a number");
			kreisel.nextLine();

		}

		kreisel.nextLine();

		System.out.println("\nEnter the name of the Training Course: ");
		courseName = kreisel.nextLine();

		employPosition = new Employee(employeeNumber, name, year, courseName);

		System.out.println("ENter the position 1 to " + (linkList.size() + 1) + " that you want to insert the employee");
		position = kreisel.nextInt();

		linkList.add(employPosition, position);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainingCourse course = new TrainingCourse();

	}

}
