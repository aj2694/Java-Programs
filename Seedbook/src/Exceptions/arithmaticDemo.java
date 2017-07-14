package Exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class arithmaticDemo {
public static void main(String[] args) throws Exception{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter two numbers divident and divisor");
	int divi=sc.nextInt();
	int divis=sc.nextInt();
	assert(divis>0);
	/*try{
		int res=divi/divis;
		System.out.println(res);
		
	}
	catch(Exception a){
		System.out.println("the second number was zero");
	}*/
	
}
}
