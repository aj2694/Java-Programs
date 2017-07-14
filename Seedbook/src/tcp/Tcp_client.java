package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Tcp_client implements Runnable{
	Socket connection;
	Thread t;
	public Tcp_client() {
		// TODO Auto-generated constructor stub
		try {
			connection=new Socket(InetAddress.getLocalHost(), 2000);
			System.out.println("request sent");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t=new Thread(this, "thread2");
		System.out.println("client");
		t.start();
		
	}
	@Override
	public void run() {
		BufferedWriter osw;
		try {
			osw = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
			System.out.println("enter file name");
		Scanner sc=new Scanner(System.in);
	String filename=sc.nextLine();
	sc.close();
	
	System.out.println("notified");
	while(true){
				osw.write(filename);
				osw.newLine();
				osw.flush();
				System.out.println("sent");
		break;
			}
Thread.sleep(1000);
while(true){
BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
System.out.println(br.readLine());


	
	break;
}

} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	finally{
		try {
			connection.close();
			System.out.println("connection client close");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
		// TODO Auto-generated method stub
		
	}

}
