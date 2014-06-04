package clientTest;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//Send to server
public class client {
	public static void main (String[] args) { 
		try {
			InetAddress ipaddress = InetAddress.getLocalHost();
			Socket socket = new Socket(ipaddress,5113);
			OutputStream output = socket.getOutputStream();
			String test = "Hello, World";
			output.write(test.getBytes());
			output.flush();
			socket.close();
			output.close();			
		}
		catch(Exception e) {
			System.out.println("client.java");
		}
	}
}
