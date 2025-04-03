package via.pro2.exercises.E1login.server.mediator;

import com.google.gson.Gson;
import via.pro2.exercises.E1login.server.model.*;
import via.pro2.exercises.E1login.server.model.UserPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class UserClientHandler implements Runnable
{
  private Socket socket;
  private BufferedReader in;
  private PrintWriter out;
  private boolean running;
  private Gson gson;
  private String clientIp;
  private Model model;

  public UserClientHandler(Socket socket, Model model) throws IOException
  {
    this.model = model;
    this.socket = socket;
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out = new PrintWriter(socket.getOutputStream(), true);
  }

  public void close()
  {
    try
    {
      in.close();
      out.close();
      socket.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void run()
  {
    gson = new Gson();
    try
    {
      //      read from client
      String clientText = in.readLine();
      System.out.println("Client side>> " + clientText);

      //      convert from json
      UserPackage userPackage = gson.fromJson(clientText, UserPackage.class);

      Model model = new ModelManager();
      String name = userPackage.getUser();
      String password = userPackage.getPassword();
      model.addUser(name, password);

      UserName userName = new UserName(name);
      Password password1 = new Password(password);
      User user = new User(userName, password1);

      //      create a reply
      if (model.contains(user))
      {
        String reply = "Success: you are now logged in";

        //      send to client
        System.out.println("Server: " + reply);
        out.println(reply);
      }

    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
}
