package udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;

public class Udp_client implements Runnable {
	DatagramSocket sc;
	Socket connection;
	BufferedReader br;
	Thread t2;
	
	 public Udp_client() {
		// TODO Auto-generated constructor stub
	
		t2=new Thread(this, "thread2");
	
		t2.start();
	}

	@Override
	public void run() {
		try {
			sc= new DatagramSocket(1342);
			InetAddress Ip=InetAddress.getLocalHost();
			byte[] buff=new byte[100];
			DatagramPacket r=new DatagramPacket(buff, 100);
			while(true){
			sc.receive(r);
			String str=new String(r.getData());
			System.out.println(str);
			System.out.println("done");
			}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			sc.close();
		}
	
		// TODO Auto-generated method stub
		
	}

}
