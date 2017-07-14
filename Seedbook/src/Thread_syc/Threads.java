package Thread_syc;

public class Threads implements Runnable {
	Thread t;
	SyncDemo s;
	public Threads(SyncDemo d,String name) {
		t=new Thread(this, name);
		this.s=d;
		t.start();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		int i=0;
		// TODO Auto-generated method stub
		synchronized (s) {
			s.print(i);
		}
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
