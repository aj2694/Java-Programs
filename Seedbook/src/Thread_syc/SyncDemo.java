package Thread_syc;

public class SyncDemo {

	public void print(int i){
		
		try {
			while(i<51){
				if(i==50){
					
					wait();
					
					System.out.println(i);
					System.out.println("thread up"+Thread.currentThread().getName());
				}
				System.out.println(i);
				i++;
				notify();
				
				}
			
			
			System.out.println("done");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	}
}
