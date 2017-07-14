package ioexercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileop {

	public static void main(String[] args) {
		File f1=new File("file1.txt");
		f1.setReadable(true);
		File f2=new File("file2.txt");
		f2.setWritable(true);
		if(f1.isFile()){
			System.out.println("File available to read");
		}
		BufferedReader b;
		try {
			b = new BufferedReader(new FileReader(f1));
			BufferedWriter w=new BufferedWriter(new FileWriter(f2));
			while(b.read()!=-1)
			{
			String str1 = b.readLine();
			System.out.println(str1);
			
			w.write(str1);
			
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
