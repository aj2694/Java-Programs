package innerclasses_string_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*Account a1=new Account(1, "AAJ", (float) 123.00);
		Account.Locker l1=a1.new Locker(1);
		System.out.println(l1.toString());
		l1.print();
		Account a2=new Account(2, "J", (float) 100);
		Account.Locker l2=a2.new Locker(2);
		l2.print();*/
		StringBuffer sb=new StringBuffer("helloworld");
		sb=sb.reverse();
		System.out.println(sb);
		System.out.println(sb.indexOf("o"));
		sb.insert(2, "lol");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		System.out.println(sb.reverse());
		Scanner s1=new Scanner(System.in);
		System.out.println("enter operation");
		String operation=s1.nextLine();
		System.out.println("enter two numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		switch(operation){
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		default:
			System.out.println(a+""+b);
		}
	File fp= new File("test.txt");
	 if(fp.exists()){
		 System.out.println("exists");
	 }
	 fp.setWritable(true);
	 BufferedWriter w;
	try {
		w = new BufferedWriter(new FileWriter(fp));
		 w.write(operation);
		 w.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 
	}
}
