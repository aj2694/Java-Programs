package Multithreaded;

import java.util.Scanner;

public class Test {
public static void main(String[] args) {
/*	Thread t1=Thread.currentThread();
	System.out.println("executing"+t1.getName());
	new Threads("Thread1");
	new Threads("Thread2");
	new Threads("Thread3");
	new Threads("Thread4");*/
	System.out.println("Enter two numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	new Threads("Thread-1",a);
	new Multiply("Thread-2",b);
	
	
}
}
