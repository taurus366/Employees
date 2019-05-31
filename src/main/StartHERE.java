package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import Databases.InsertIntoDB;
import Databases.ReadfromDB;
import console.AddEmployee;
import models.Employees;

public class StartHERE {
	public static ArrayList<Employees> employees = new ArrayList<>();
	public static Scanner keyboard;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		AddEmployee.AddEmployees();
		

		keyboard = new Scanner(System.in);

		System.out.println("Do you want these employees add to Json list ? yes/no");
		String answer = keyboard.next();

		if (answer.equals("yes")) {
			System.out.println(employees.size());
			
			InsertIntoDB.insertIntoDatabase(gson.toJson(employees));

		}
		
		System.out.println("Do you want to read Json list from file ? yes/no");
		String answer2 = keyboard.next();
		
		if(answer2.equals("yes")) {
			
			for (int i=0;i<ReadfromDB.readDataFromDatabaseCandidate().size();i++) {
				Employees readfromdb = ReadfromDB.readDataFromDatabaseCandidate().get(i);
				System.out.println(readfromdb.name + readfromdb.totalSales + readfromdb.salesPeriod + readfromdb.experienceMultiplier);
			
			}
			
			
			//ReadfromDB.readDataFromDatabaseCandidate();
			
		}
		System.out.println("Do you want to get score from saved employees file? (yes/no)");
		String answer3 = keyboard.next();
		if(answer3.equals("yes")) {
			File file = new File("test.csv");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Name , Score");
			bw.newLine();
			for(int i =0;i<ReadfromDB.readDataFromDatabaseCandidate().size();i++) {
				Employees employees = ReadfromDB.readDataFromDatabaseCandidate().get(i);
				bw.write(employees.name+","+employees.salesPeriod);
				bw.newLine();
			}
			bw.close();
			fw.close();
		}

	}

}
