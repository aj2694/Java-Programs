package Interthread_Comm;

public class Prod implements Runnable{

	Thread t;
	Resource r;
	public Prod(String name, Resource r){
		Thread t=new Thread(this, name);
		this.r=r;
		t.start();
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (r) {
			
			int i=0;
			while(true){
			r.setR(i++);
			if(i==50){
				break;
			}
			}
		}
		
	}
}

