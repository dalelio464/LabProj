import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


public class client {
	public static void main (String[] args) { 
		try {
			InetAddress ipaddress = InetAddress.getLocalHost();
			Socket socket = new Socket(ipaddress,4646);
			InputStream is = socket.getInputStream();
			BufferedReader serverInput = new BufferedReader(new InputStreamReader(is));
			String time = serverInput.readLine();
			System.out.println(time);
			socket.close();
		}
		catch(Exception e) {
			System.out.println("client.java");
		}
	}
}
