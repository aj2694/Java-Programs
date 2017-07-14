package Interthread_Comm;

public class Consumer implements Runnable {
	Thread t;
	Resource r;
	public Consumer(String name, Resource r){
		Thread t=new Thread(this, name);
		this.r=r;
		t.start();
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (r) {
			int c=0;
			while(true){
				
			r.getR();
			c++;
			if(c==50){
				break;
			}
			
			}
		}

}
}
