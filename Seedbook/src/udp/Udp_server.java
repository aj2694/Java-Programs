package udp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Udp_server implements Runnable {

	DatagramSocket sc;
	Socket connection;
	BufferedReader br;
	Thread t1;
	
	public Udp_server(){
		t1=new Thread(this, "thread1");
	
		t1.start();
	}

	@Override
	public void run() {
		try {
			sc= new DatagramSocket();
			InetAddress Ip=InetAddress.getLocalHost();
			String sr="helloworld!";
			DatagramPacket p=new DatagramPacket(sr.getBytes(), sr.length(), Ip, 1342);
			sc.send(p);
			System.out.println("send");
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
