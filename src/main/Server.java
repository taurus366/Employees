package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Employees;

public class Server {
	private static Scanner keyboard;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keyboard = new Scanner(System.in);
		ArrayList<Employees> employees = new ArrayList<>();
		int employee1totalSales=0;
		int employee1salesPeriod=0;
		double employee1experienceMultiplier = 0;
		
		do {
			System.out.println("Please enter your name: ");
			String employee1name = keyboard.next();
			boolean isINT = true;
			do {
				System.out.println("Please enter employee totalSales: ");

				try {
				employee1totalSales = keyboard.nextInt();
				isINT = true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT=false;
					keyboard.nextLine();
				}
				
			} while (!isINT == true);
			
			
			do {
				System.out.println("Please enter employee salesPeriod: ");
				try {
					employee1salesPeriod = keyboard.nextInt();
					isINT= true;
				} catch (Exception e) {
					// TODO: handle exception
					isINT=false;
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
			
			
		
			Employees employee = new Employees(employee1name, employee1totalSales, employee1salesPeriod, employee1experienceMultiplier);
			employees.add(employee);
			
			System.out.println("Do you want to add more? yes/no");
			
			
		} while (keyboard.next().equals("yes"));
		
		
	}

}
