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
		
		do {
			System.out.println("Please enter your name: ");
			String employee1name = keyboard.next();
			boolean istrue = true;
			do {
				System.out.println("Please enter employee totalSales: ");
//				if(keyboard.hasNextInt()) {
//					employee1totalSales=keyboard.nextInt();
//					istrue = true;
//				}else {
//					istrue = false;
//					keyboard.nextLine();
//				}
				try {
				employee1totalSales = keyboard.nextInt();
				istrue = true;
				} catch (Exception e) {
					// TODO: handle exception
					istrue=false;
					keyboard.nextLine();
				}
				
			} while (!istrue == true);
			//System.out.println("Please enter employee totalSales: ");
			//int employee1totalSales = keyboard.nextInt();
			
			System.out.println("Please enter employee salesPeriod: ");
			int employee1salesPeriod = keyboard.nextInt();
			
			System.out.println("Please enter employee experienceMultiplier: ");
			double employee1experienceMultiplier = keyboard.nextDouble();
		
			Employees employee = new Employees(employee1name, employee1totalSales, employee1salesPeriod, employee1experienceMultiplier);
			employees.add(employee);
			System.out.println("Do you want to add more? yes/no");
			
			
		} while (keyboard.next().equals("yes"));
		
		
	}

}
