import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) throws Exception {
		
		String ip="localhost",name="praveen";
		int port=8888;
		
		Socket socket=new Socket(ip,port);
		
		OutputStreamWriter writer =new OutputStreamWriter(socket.getOutputStream()); 
		PrintWriter out = new PrintWriter(writer);
		
		out.println(name);
		out.flush();
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str=reader.readLine();
		
		System.out.println(" C  :  "+str);
		
	
		
	}

}
