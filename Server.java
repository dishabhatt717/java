package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	ServerSocket server;
	Socket connection;
	DataInputStream dis;
	DataOutputStream dos;
	DataInputStream disi;
	
	public Server() {
		try {
			server = new ServerSocket(2300,1,InetAddress.getLocalHost());
			System.out.println("Server Started..");
			connection = server.accept();
			System.out.println("Request Received..");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void talk () throws IOException ,UnknownHostException {
		dis = new DataInputStream(connection.getInputStream());
		dos = new DataOutputStream(connection.getOutputStream());
		disi =new DataInputStream(System.in);
		while (true) {
			System.out.println("Client:"+ dis.readUTF());
			dos.writeUTF(disi.readLine());
			
		}
	}
	public static void main(String[] args) {
		
		try {
			Server cs =new Server();
			cs.talk();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
