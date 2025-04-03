package via.pro2.exercises.E1login.server.mediator;

import via.pro2.exercises.E1login.server.model.Model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UserServer implements Runnable
{
  private static int PORT = 2910;
  private boolean running;
  private ServerSocket welcomeSocket;
  private Model model;

  public UserServer(Model model)
  {
    this.model = model;
    System.out.println("Starting Server...");

    try
    {
      welcomeSocket = new ServerSocket(PORT);

    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }

  public void close()
  {
    running = false;
    try
    {
      welcomeSocket.close();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }

  @Override public void run()
  {
    running = true;
    while (running)
    {
      try
      {
        System.out.println("Waiting for a client...");

        //      accept
        Socket socket = welcomeSocket.accept();
        UserClientHandler c = new UserClientHandler(socket, model);
        Thread t = new Thread(c);
        t.start();

      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
