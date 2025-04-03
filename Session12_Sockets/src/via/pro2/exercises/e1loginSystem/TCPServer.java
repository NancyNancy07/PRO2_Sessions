package via.pro2.exercises.e1loginSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer
{
  public static void main(String[] args) throws IOException
  {
    final int PORT = 5678;
    System.out.println("Starting Server...");
    //        start server
    ServerSocket listenSocket = new ServerSocket(PORT);

    while (true)
    {
      System.out.println("Waiting for client");

      //      accept
      Socket socket = listenSocket.accept();

      //      create streams
      BufferedReader in = new BufferedReader(
          new InputStreamReader(socket.getInputStream()));

      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

      //      communicate with client
      String request = in.readLine();
      System.out.println("Client: " + request);

      if (!request.equals("connect"))
      {
        System.out.println("Disconnected");
        out.println("Disconnected");
        continue;
      }

      //process request
      out.println("Username?");
      String userName = in.readLine();
      System.out.println("Client: " + userName);

      out.println("Password?");
      String password = in.readLine();
      System.out.println("Client: " + password);

      out.println("Approved");
    }

  }
}
