package via.pro2.exercises.E1login.server;

import via.pro2.exercises.E1login.server.mediator.UserServer;
import via.pro2.exercises.E1login.server.model.Model;
import via.pro2.exercises.E1login.server.model.ModelManager;

import java.io.IOException;

public class UserServerTest
{
  public static void main(String[] args) throws IOException
  {
    Model model = new ModelManager();
    UserServer u1 = new UserServer(model);
    Thread serverThread = new Thread(u1);
    serverThread.start();
  }
}
