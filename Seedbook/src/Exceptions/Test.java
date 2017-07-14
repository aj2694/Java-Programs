package Exceptions;

public class Test {

	public static void main(String[] args) {
		Account a=new Account();
		try{
		a.withdraw();
		}
		catch(AppSpecific w){
			w.printStackTrace();
		}
	}
}
