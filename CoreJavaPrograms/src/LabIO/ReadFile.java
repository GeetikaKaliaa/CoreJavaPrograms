package LabIO;

//Write a java program to read a file line by 
//line and store it into a variable.


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strB=new StringBuilder();
		String strLine="";
		String strData="";
		
		try {
			BufferedReader b= new BufferedReader(new FileReader("C:\\Users\\geeti\\OneDrive\\Desktop\\ioLab.txt"));
			while(strLine !=null) {
				if(strLine==null) break;
				strData+=strLine;
				strLine=b.readLine();
				
			}
			System.out.println(strData);
			b.close();
			
		}catch(FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
