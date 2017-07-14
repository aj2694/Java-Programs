package Thread_syc;

public class Test {
public static void main(String[] args) {
	SyncDemo d=new SyncDemo();
	new Threads(d,"t1");
	new Threads(d,"t2");
	new Threads(d,"t3");
	
	}
	
}
