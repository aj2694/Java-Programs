package Multithreaded;

public class Multiply implements Runnable {

	Thread t;
	int num;
	 public Multiply(String name, int num) {
		t=new Thread(this, name);
		this.num=num;
		t.start();
		// TODO Auto-generated constructor stub
	}
	 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		 try {
			 int i;
			 for(i=1;i<11;i++){
			 System.out.println("\t"+i*num);
			Thread.sleep(1000);
			 }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		 }
	}

}
