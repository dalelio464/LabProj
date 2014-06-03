import java.net.*;
import java.io.*;


public class labServerDaemon extends Thread {
	public labServerDaemon() {
		start();
	}
	public void run() {
		try {
			ServerSocket socket = new ServerSocket(4646);
			while(true) {
				Socket socketAccept = socket.accept();
				new ClientHandler(socketAccept);
			}
		}
		catch(Exception e) {
				System.out.println("labServerDaemon.java");
		}
	}	
}