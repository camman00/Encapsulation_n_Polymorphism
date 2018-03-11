import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * A simple Swing-based client for the capitalization server. It has a main
 * frame window with a text field for entering strings and a textarea to see the
 * results of capitalizing them.
 */
public class ReverseClient {

	private Scanner in;
	private PrintWriter out;
	Scanner kb = new Scanner(System.in);

	//Create a member variable for your Socket.

	public boolean update() {
		out.println(kb.nextLine());
		String response;
		try {
            response = in.nextLine() + "OOOOOOOOOOOOOOOOOOOOOOOOOFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
            if (response == null || response.equals("")) {
                  System.exit(0);
              }
        } catch (Exception ex) {
               response = "Error: " + ex;
        }
        System.out.println(response);

		return true;
	}

	/**
	 * Implements the connection logic by prompting the end user for the
	 * server's IP address, connecting, setting up streams, and consuming the
	 * welcome messages from the server. The Capitalizer protocol says that the
	 * server sends three lines of text to the client immediately after
	 * establishing a connection.
	 */
	public void connectToServer() throws IOException {

		// Get the server address from a dialog box.
		String serverAddress = JOptionPane.showInputDialog(null, "Enter IP Address of the Server:",
				"Welcome to the Capitalization Program", JOptionPane.QUESTION_MESSAGE);

		//Initialize your socket and pass in the serverAddress and port number
		Socket socket = new Socket(serverAddress, 9898);
		
		//initialize your Scanner and pass in your socket's input stream.(Hint: getter)
		in = new Scanner(socket.getInputStream());

		//initialize your PrintWriter and pass in your socket's output stream.(Hint: getter)
		out = new PrintWriter(socket.getOutputStream(), true);

		for (int i = 0; i < 3; i++) {
			System.out.println(in.nextLine() + "\n");
        }

	}

	
		
	

	/**
	 * Runs the client application.
	 */
	public static void main(String[] args) throws Exception {
		//Instantiate a new ReverserClient();
		ReverseClient rx = new ReverseClient();

		//call the connectToServer Method
		rx.connectToServer();
		
		//continuously call the client's update method until it is ready to close.
		while(rx.update()){
			
		}

	}
}
