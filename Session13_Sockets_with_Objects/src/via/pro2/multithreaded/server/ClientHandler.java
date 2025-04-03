package via.pro2.multithreaded.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable
{
  private BufferedReader in;
  private PrintWriter out;
  private Socket socket;

  public ClientHandler(Socket socket) throws IOException
  {
    this.socket = socket;
    //    create input stream
    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    //    create output stream
    out = new PrintWriter(this.socket.getOutputStream(), true);
  }

  @Override public void run()
  {
    try
    {
      String request = in.readLine();
      System.out.println(
          "Client: " + request + " \n On thread" + Thread.currentThread()
              .getName());

      String reply = request.toUpperCase();
      System.out.println("Server: " + reply);
      out.println(reply);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
