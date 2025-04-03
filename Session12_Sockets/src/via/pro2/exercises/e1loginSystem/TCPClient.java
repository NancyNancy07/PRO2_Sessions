package via.pro2.exercises.e1loginSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient
{
  public static void main(String[] args) throws IOException
  {
    final int PORT = 5678;
    final String HOST = "localhost";

    Scanner input = new Scanner(System.in);

    Socket clientSocket = new Socket(HOST, PORT);

    BufferedReader in = new BufferedReader(
        new InputStreamReader(clientSocket.getInputStream()));

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

    String request = "connect";
    //    System.out.println("Client: " + request);
    out.println(request);

    String reply = in.readLine();
    System.out.println("Server: " + reply);

    if ("Disconnected".equals(reply))
    {
      System.out.println("Server rejected connection. Exiting...");
      return;
    }

    System.out.print("Enter username: ");
    String username = input.nextLine();
    out.println(username);

    reply = in.readLine();
    System.out.println("Server: " + reply);

    System.out.print("Enter password: ");
    String password = input.nextLine();
    out.println(password);

    reply = in.readLine();
    System.out.println("Server: " + reply);

    if ("Approved".equals(reply)) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Login failed.");
    }

    in.close();
    out.close();
    clientSocket.close();
  }
}
