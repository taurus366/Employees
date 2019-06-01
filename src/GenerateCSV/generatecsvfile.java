package GenerateCSV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Databases.ReadfromDB;
import models.Employees;
import models.CSVemployees;

public class generatecsvfile{
	private static ArrayList<CSVemployees> choosedEmployees = new ArrayList<>();
	public static  void GenerateCSVfile() throws IOException {
		File file = new File("test.csv");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		calculate();
		
		bw.write("Name , Score");
		bw.newLine();
		for(int i =0;i<choosedEmployees.size();i++) {
			CSVemployees employees = choosedEmployees.get(i);
			bw.write(employees.name+","+employees.score);
			bw.newLine();
		}
		bw.close();
		fw.close();
		System.out.println("Successful generated ! please look at project directrory");
		
	}
	public static void calculate() {
		for(int i =0;i<ReadfromDB.readDataFromDatabaseCandidate().size();i++) {
			Employees emp = ReadfromDB.readDataFromDatabaseCandidate().get(i);
			if(emp.experienceMultiplier ==0) {
				int result = emp.totalSales/emp.salesPeriod;
				CSVemployees employ = new CSVemployees(emp.name, result);
				choosedEmployees.add(employ);
			}else {
				double result = emp.totalSales/emp.salesPeriod*emp.experienceMultiplier;
				CSVemployees employ = new CSVemployees(emp.name, result);
				choosedEmployees.add(employ);
				
			}
			
		}
	}
}
