package Databases;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import models.Employees;



public class ReadfromDB {

	public static ArrayList<Employees> readDataFromDatabaseCandidate() {
		String database_file_location = "W:\\Users\\newArcerr\\Desktop\\employees.txt";
		
		File txtFile = new File(database_file_location);
		if (!txtFile.exists())
			log("File doesn't exist");
 
		InputStreamReader isReader;
		try {
			isReader = new InputStreamReader(new FileInputStream(txtFile), "UTF-8");
 
			JsonReader myReader = new JsonReader(isReader);
 
		   Type listType = new TypeToken<ArrayList<Employees>>() {}.getType();
		   ArrayList<Employees> employees = new Gson().fromJson(myReader, listType);
           
           log("\n Employees Data loaded successfully from file " + database_file_location);
           return employees;
			
		} catch (Exception e) {
			log("error load cache from file " + e.toString());
			return null;
		}
	}
	public static void log(String string) {
		System.out.println(string);
	}
}
