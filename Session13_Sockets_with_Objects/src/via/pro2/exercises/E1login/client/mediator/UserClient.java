package via.pro2.exercises.E1login.client.mediator;

import com.google.gson.Gson;
import via.pro2.exercises.E1login.client.model.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class UserClient implements Model
{
  private Socket socket;
  private BufferedReader in;
  private PrintWriter out;
  private Gson gson;

  public UserClient(String host, int port) throws IOException
  {
    gson = new Gson();

    this.socket = new Socket(host, port);
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out = new PrintWriter(socket.getOutputStream(), true);
  }

  public void disconnect() throws IOException
  {
    in.close();
    out.close();
    socket.close();
  }

  @Override public void login(String userName, String password)
      throws IllegalStateException, IllegalArgumentException
  {
    //    create user object
    User user = new User(userName, password);

    //    convert to json
    String request = gson.toJson(user);
    System.out.println("Client>>> " + request);

    //    send to server
    out.println(request);

    //    reply from server
    try
    {
      String reply = in.readLine();
      System.out.println("Server>>> " + reply);
    }
    catch (IOException e)
    {
      e.printStackTrace();

    }
  }
}
