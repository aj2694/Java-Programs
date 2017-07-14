package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo  {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the file name");
	String s=sc.nextLine();
	File file=new File(s);
	try
	{
		if(file.exists()){
		System.out.println("good job");
		}
		else{
			FileNotFoundException e=new FileNotFoundException();
			throw e;
		}
	}
	catch(FileNotFoundException k){
		k.printStackTrace();
	}
	finally{
		System.out.println("Successs");
	}

}
}
