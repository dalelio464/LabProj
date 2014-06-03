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
			PrintStream clientOutput = new PrintStream(socketAccept.getOutputStream(), true);
			clientOutput.println(new Date());
			socketAccept.close();
		}
		catch (Exception e) {
			System.out.println("ClientHandler.java");
		}
	}
}
