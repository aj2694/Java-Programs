package Interthread_Comm;



public class Test {
	public static void main(String[] args) {
		Resource d=new Resource();
		new Prod("t1",d);
		new Consumer("t2",d);
		
		
		}
}
