package LabIO;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir") + "\\src\\appendFile.txt";
        String text = "Added text";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }
		

	}

}
