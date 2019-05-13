package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	Socket connection;
	DataInputStream dis;
	DataOutputStream dos;
	DataInputStream disi;
	
	public Client() throws Exception {
		
			
			connection = new Socket(InetAddress.getLocalHost(),2300);
			System.out.println("Request Sent..");
			
	
	}
	public void talk () {
		
		try {
		dis = new DataInputStream(connection.getInputStream());
		dos = new DataOutputStream(connection.getOutputStream());
		disi =new DataInputStream(System.in);
		while (true) {
			
			dos.writeUTF(disi.readLine());
			System.out.println("Server:"+ dis.readUTF());
			
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		
		try {
			Client cc =new Client();
			cc.talk();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
