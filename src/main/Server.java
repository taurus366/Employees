package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

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
		Gson gson = new Gson();
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
		
		//db.insertIntoDatabase(db.gson.toJson(companies));
		
		insertIntoDatabase(gson.toJson(employees));
	}
	public void copytoFILE() {
		
	}
	
	public static void insertIntoDatabase(String myData) {
		String database_file_location = "W:\\Users\\newArcerr\\Desktop\\employees.txt";
		File txtFile = new File(database_file_location);
		if (!txtFile.exists()) {
			try {
				File directory = new File(txtFile.getParent());
				if (!directory.exists()) {
					directory.mkdirs();
				}
				txtFile.createNewFile();
			} catch (IOException e) {
				log("Excepton Occured: " + e.toString());
			}
		}
 
		try {
			txtFile.delete();
			
			// Convenience class for writing character files
			FileWriter academyWriter;
			academyWriter = new FileWriter(txtFile.getAbsoluteFile(), true);
 
			// Writes text to a character-output stream
			BufferedWriter bufferWriter = new BufferedWriter(academyWriter);
			bufferWriter.write(myData.toString());
			bufferWriter.close();
 
			log("Employee saved at file location: " + database_file_location + " Data: " + myData + "\n");
		} catch (IOException e) {
			log("Hmm.. Got an error while saving Employee data to file " + e.toString());
		}
	}
	public static void log(String string) {
		System.out.println(string);
	}

}
