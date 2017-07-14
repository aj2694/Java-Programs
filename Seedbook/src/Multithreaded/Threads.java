package Multithreaded;

public class Threads implements Runnable{

	Thread t;
	int num;
	public Threads(String name,int num){
		t= new Thread(this,name);
		this.num=num;
		//System.out.println("Thread created"+t);
		t.start();
	}
	@Override
	public void run() {
		
			try {
				for (int i=0;i<11;i++){
					System.out.print(num+i);
					
				Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
	

