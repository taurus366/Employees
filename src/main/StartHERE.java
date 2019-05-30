package main;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import Databases.InsertEmployeeIntoDB;
import console.AddEmployee;
import models.Employees;

public class StartHERE {
	public static ArrayList<Employees> employees = new ArrayList<>();
	public static Scanner keyboard;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		AddEmployee.AddEmployees();
		

		keyboard = new Scanner(System.in);

		System.out.println("Do you want these employees add to Json list ? yes/no");
		String answer = keyboard.next();

		if (answer.equals("yes")) {
			System.out.println(employees.size());
			
			InsertEmployeeIntoDB.insertIntoDatabase(gson.toJson(employees));

		}
		
		System.out.println("Do you want to read Json list from file ? yes/no");
		String answer2 = keyboard.next();
		
		if(answer2.equals("yes")) {
			
		}

	}

}
