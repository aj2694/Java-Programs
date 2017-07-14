package Exceptions;

public class Account {

	private int balance;
	private int amtdeducted;
	
	public Account() {
		this.balance=1050;
		this.amtdeducted=500;
		// TODO Auto-generated constructor stub
	}

	public void withdraw() throws AppSpecific{
		
			int res=balance-amtdeducted;
			if(res>1000){
				System.out.println("Transaction succesful");
			}
			else{
				AppSpecific a=new AppSpecific();
				throw a;
			}
		}
		
	}

