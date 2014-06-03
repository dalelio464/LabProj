package testts;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("98.110.186.23",5113);
			System.out.println(socket.isConnected());
			OutputStream outStream = socket.getOutputStream();
			PrintWriter serverSend = new PrintWriter(new OutputStreamWriter(outStream));
			serverSend.write("aaa");
			socket.close();
		}
		catch(Exception e){
			System.out.print("test");
		}
	}
}