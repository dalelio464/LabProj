package serverTest;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;


public class ClientHandler extends Thread {
	private Socket socketAccept;
	public ClientHandler(Socket socket) {
		this.socketAccept = socket;
		start();
	}
	public void run() {
		try {
			byte[] dataStream = null;
			InputStream input = socketAccept.getInputStream();
			while(!this.socketAccept.isClosed()) {
				input.read(dataStream);
				System.out.println(new String(dataStream));
			}
			socketAccept.close();
		}
		catch (Exception e) {
			System.out.println("ClientHandler.java");
		}
	}
}
