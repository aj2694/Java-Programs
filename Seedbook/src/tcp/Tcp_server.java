package tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_server implements Runnable {
	

	ServerSocket sc;
	Socket connection;
	BufferedReader br;
	Thread t1;
	
	public Tcp_server(){
		t1=new Thread(this, "thread1");
	
		t1.start();
	}


	@Override
	public void run() {
		try {
			sc=new ServerSocket(2000);
			connection=sc.accept();
			System.out.println("server ready");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	BufferedReader dc;
		try {
		
			dc = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String filename=null;
		System.out.println("before wait");
		
		while((filename=dc.readLine())!=null){
			System.out.println(filename);
			
			break;
				}
		System.out.println("here");
		//DataOutputStream dout=new DataOutputStream(connection.getOutputStream());
		
		File fp=new File(filename);
		
		if(fp.exists()){
			System.out.println("file found");
			BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
			wr.write("name"+fp.getName());
			wr.write(fp.getAbsolutePath());
			
			wr.close();
			Thread.sleep(1000);
		}
		else{
			System.out.println("not found");
		}
		
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	finally{
		try {
			connection.close();
			System.out.println("connectionserverclosed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}