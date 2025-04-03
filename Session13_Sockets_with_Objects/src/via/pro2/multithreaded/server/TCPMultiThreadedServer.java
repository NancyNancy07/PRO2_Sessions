package via.pro2.multithreaded.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMultiThreadedServer
{
  final static int PORT = 4425;

  public static void main(String[] args) throws IOException
  {
    System.out.println("Starting Server...");

    //    create listen socket
    ServerSocket listenSocket = new ServerSocket(PORT);

    while (true)
    {
      System.out.println("Waiting for a client...");
      //      accept
      Socket socket = listenSocket.accept();

      //      start a new thread with client
      ClientHandler c = new ClientHandler(socket);
      Thread t = new Thread(c);
      t.start();
    }
  }

}
