package sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servernewsocket  {

public static void main(String[] args) throws Exception
{
	int port=8888;	
	System.out.println(" S  :  Server Started ...........");
	ServerSocket ss =new ServerSocket(8888);
	
	System.out.println(" S  :  Waiting for Client ...........");
	Socket s=ss.accept();
	
	System.out.println(" S  :  Client Connected ...........");
	BufferedReader reader =new BufferedReader(new InputStreamReader(s.getInputStream()));
	String str=reader.readLine();
	
	System.out.println(" S  :  "+str);
	
	OutputStreamWriter writer =new OutputStreamWriter(s.getOutputStream()); 
	PrintWriter out = new PrintWriter(writer);
	
	out.println("developer");
	out.flush();

	
}
	
	
}
