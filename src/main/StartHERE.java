package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import Databases.InsertIntoDB;
import Databases.ReadfromDB;
import GenerateCSV.generatecsvfile;
import console.AddEmployee;
import models.Employees;

public class StartHERE {
	public static String database_file_location = "C:\\Users\\taurus366\\Desktop\\employees.txt";
	public static ArrayList<Employees> employees = new ArrayList<>();
	public static Scanner keyboard;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		AddEmployee.AddEmployees();
		Question();

	}

	public static void Question() throws IOException {
		Gson gson = new Gson();
		keyboard = new Scanner(System.in);

		System.out.println("Do you want these employees add to Json list ? yes/no");
		String answer = keyboard.next();

		if (answer.equals("yes")) {
			System.out.println(employees.size());

			InsertIntoDB.insertIntoDatabase(gson.toJson(employees));

		}
		System.out.println("Do you want to read Json list from file ? yes/no");
		String answer2 = keyboard.next();

		if (answer2.equals("yes")) {

			for (int i = 0; i < ReadfromDB.readDataFromDatabaseCandidate().size(); i++) {
				Employees readfromdb = ReadfromDB.readDataFromDatabaseCandidate().get(i);
				System.out.println(readfromdb.name + readfromdb.totalSales + readfromdb.salesPeriod
						+ readfromdb.experienceMultiplier);

			}

		}
		System.out.println("Do you want to generate score(name,score) from saved employees txt file? (yes/no)");
		String answer3 = keyboard.next();
		if (answer3.equals("yes")) {
			generatecsvfile.GenerateCSVfile();
		}
	}

}
