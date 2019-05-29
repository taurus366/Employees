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
		 
		
		System.out.println("Please enter your name: ");
		String employee1name = keyboard.nextLine();
		System.out.println("Please enter employee totalSales: ");
		int employee1totalSales = keyboard.nextInt();
		System.out.println("Please enter employee salesPeriod: ");
		int employee1salesPeriod = keyboard.nextInt();
		System.out.println("Please enter employee experienceMultiplier: ");
		double employee1experienceMultiplier = keyboard.nextDouble();
		//employees.add(employee1name+employee1totalSales+employee1salesPeriod+employee1experienceMultiplier);
		//employees.add(employee1name);
		//Companies companies1 = new Companies(txtCompanyname.getText(), txtPosition.getText(),txtType.getText(), dtrpnDescription.getText());
		//companies.add(companies1);
		Employees employee = new Employees(employee1name, employee1totalSales, employee1salesPeriod, employee1experienceMultiplier);
		employees.add(employee);
		System.out.println(employees.size());
		for(int i=0;i<employees.size();i++) {
			Employees ik = employees.get(i);
			System.out.println(ik.name+ik.salesPeriod+ik.totalSales+ik.experienceMultiplier);
		}
		
	}

}
