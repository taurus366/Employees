package Databases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InsertIntoDB {

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
