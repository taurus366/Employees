package main;

import java.util.ArrayList;
import java.util.Scanner;

import models.Employees;

public class StartHERE {
	public static ArrayList<Employees> employees = new ArrayList<>();
	public static Scanner keyboard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddEmployee.AddEmployee1();
		
		keyboard = new Scanner(System.in);
		
		System.out.println("Do you want these employees add to Json list ? yes/no");
		String answer = keyboard.next();
		
		if(answer.equals("yes")) {
			System.out.println("FUCK OF YOU!");
		}
		
	}

}
