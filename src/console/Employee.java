package console;

import java.util.Scanner;

import main.StartHERE;
import models.Employees;

public class Employee {
	private static Scanner keyboard;
	public static String answer = null;
	
	public static void AddEmployees() {

		keyboard = new Scanner(System.in);

		int employeeTotalSales = 0;
		int employeeSalesPeriod = 0;
		double employeeExperienceMultiplier = 0;
		
		do {
			System.out.println("Please enter your name: ");
			String employee1name = keyboard.nextLine();
			boolean isINT = true;
			do {
				System.out.println("Please enter employee totalSales: ");

				try {
					employeeTotalSales = keyboard.nextInt();
					isINT = true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT = false;
					keyboard.nextLine();
				}

			} while (!isINT == true);

			do {
				System.out.println("Please enter employee salesPeriod: ");
				try {
					employeeSalesPeriod = keyboard.nextInt();
					isINT = true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT = false;
					keyboard.nextLine();
				}

			} while (!isINT == true);

			do {
				System.out.println("Please enter employee experienceMultiplier: ");

				try {
					employeeExperienceMultiplier = keyboard.nextDouble();
					isINT = true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT = false;
					keyboard.nextLine();
				}

			} while (!isINT == true);

			Employees employee = new Employees(employee1name, employeeTotalSales, employeeSalesPeriod,
					employeeExperienceMultiplier);

			StartHERE.employees.add(employee);

			System.out.println("Do you want to add more? yes/no");
			answer = keyboard.next(); 
			keyboard.nextLine();

		} while (answer.equals("yes"));
	}
}
