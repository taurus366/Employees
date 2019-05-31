package console;

import java.util.Scanner;

import main.StartHERE;
import models.Employees;

public class AddEmployee {
	private static Scanner keyboard;
	public static String answer = null;
	public static void AddEmployees() {

		keyboard = new Scanner(System.in);

		int employee1totalSales = 0;
		int employee1salesPeriod = 0;
		double employee1experienceMultiplier = 0;
		
		do {
			System.out.println("Please enter your name: ");
			String employee1name = keyboard.nextLine();
			boolean isINT = true;
			do {
				System.out.println("Please enter employee totalSales: ");

				try {
					employee1totalSales = keyboard.nextInt();
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
					employee1salesPeriod = keyboard.nextInt();
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
					employee1experienceMultiplier = keyboard.nextDouble();
					isINT = true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT = false;
					keyboard.nextLine();
				}

			} while (!isINT == true);

			Employees employee = new Employees(employee1name, employee1totalSales, employee1salesPeriod,
					employee1experienceMultiplier);

			StartHERE.employees.add(employee);

			System.out.println("Do you want to add more? yes/no");
			answer = keyboard.next(); 
			keyboard.nextLine();

		} while (answer.equals("yes"));
	}
}
