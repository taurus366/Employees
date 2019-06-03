package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

import console.Employee;
import databases.InsertIntoDB;
import databases.ReadfromDB;
import generator.CsvFile;
import models.Employees;

public class StartHERE {
	public static String database_file_location = "W:\\Users\\newArcerr\\Desktop\\employees.txt"; // Please choose your .txt file location !
	public static ArrayList<Employees> employees = new ArrayList<>();
	public static Scanner keyboard;

	public static void main(String[] args) throws IOException {
		

		Employee.AddEmployees();
		Question();

	}

	/** InsertIntoDB.insertIntoDatabase(gson.toJson(employees)); -> add employees to .txt file Json format.
	 * generatecsvfile.GenerateCSVfile(); -> generate CSV file with employees score.
	 * @throws IOException
	 */
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
				System.out.println( "name: "+readfromdb.name +" "+"totalSales: "+ readfromdb.totalSales +" "+"salesPeriod: "+ readfromdb.salesPeriod+" "
						+"experienceMultiplier: "+ readfromdb.experienceMultiplier);

			}

		}
		System.out.println("Do you want to generate score(name,score) from saved employees txt file? (yes/no)");
		String answer3 = keyboard.next();
		if (answer3.equals("yes")) {
			CsvFile.GenerateCSVfile();
		}else {
			System.out.println("Thank you, bye for next time.");
		}
	}

}
