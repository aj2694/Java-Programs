package Interthread_Comm;

public class Resource {

	int r;
	boolean gotval = true;

	public void getR() {
	
		System.out.println("Got"+r);
		gotval =true;
		notify();
		while(gotval){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	
		
		
	

	}

	public void setR(int r) {

		while (!gotval) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		this.r = r;
		System.out.println("put:" + r);		
		gotval= false;
		notify();
			}

}
