package via.pro2.multithreaded.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client
{
  final static int PORT = 4425;
  //  final static String HOST = "localhost";

  public static void main(String[] args)
      throws UnknownHostException, IOException
  {
    //    another way to get the host
    final InetAddress host = InetAddress.getLocalHost();
    System.out.println("Starting client");

    //   create scanner, socket, input, output
    Scanner input = new Scanner(System.in);

    //    1. create socket to connect the server
    Socket clientSocket = new Socket(host, PORT);

    //    2. create IO streams for communication
    BufferedReader in = new BufferedReader(
        new InputStreamReader(clientSocket.getInputStream()));

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

    //    perform communication
    System.out.println("Write a line");

    String request = input.nextLine();
    System.out.println("Client side: " + request);

    //    send to server
    out.println(request);

    //    read the reply from server
    String reply = in.readLine();
    System.out.println("Server side: " + reply);

    //    close connection
    in.close();
    out.close();
    clientSocket.close();
  }
}
