package via.pro2.json.client;

import com.google.gson.Gson;
import via.pro2.json.model.Message;
import via.pro2.json.model.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client
{

  public static void main(String[] args) throws IOException
  {
    final int PORT = 4525;
    final String HOST = "localhost";
    Gson gson = new Gson();

    System.out.println("Starting client");

    Scanner input = new Scanner(System.in);

    //    1. create socket to connect the server
    Socket clientSocket = new Socket(HOST, PORT);

    //    2. create IO streams for communication
    BufferedReader inFromServer = new BufferedReader(
        new InputStreamReader(clientSocket.getInputStream()));

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

    //    read from keyboard
    System.out.println("Enter your name");
    String name = input.nextLine();

    System.out.println("Enter student number");
    int number = input.nextInt();
    input.close();

    //    create student object
    Student s1 = new Student(name, number);
    System.out.println("Student Object: " + s1);

    //    convert to json
    String json = gson.toJson(s1);

    //    send to server
    out.println(json);

    //    read the reply from server
    String serverReply = inFromServer.readLine();
    System.out.println("Server side: " + serverReply);

    //    convert message from json
    Message reply = gson.fromJson(serverReply, Message.class);
    System.out.println("Message: " + reply);

    System.out.println("Student only: " + reply.getStudent());

    //    close connection
    inFromServer.close();
    out.close();
    clientSocket.close();
  }
}
