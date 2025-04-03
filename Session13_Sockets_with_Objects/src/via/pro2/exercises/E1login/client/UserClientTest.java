package via.pro2.exercises.E1login.client;

import via.pro2.exercises.E1login.client.model.Model;
import via.pro2.exercises.E1login.client.model.ModelManager;

import java.io.IOException;
import java.util.Scanner;

public class UserClientTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    Model model;

    try
    {
      model = new ModelManager("localhost", 2910);
    }
    catch (IOException e)

    {
      System.err.println("Failed to connect to server: " + e.getMessage());
      return;
    }

    boolean loggedIn = false;
    while (!loggedIn)
    {
      System.out.println("Enter username:");
      String username = input.nextLine();
      System.out.println("Enter password:");
      String password = input.nextLine();

      try
      {
        model.login(username, password);
        System.out.println("You are now logged in!");
        loggedIn = true;
      }
      catch (Exception e)
      {
        System.err.println(e.getMessage());
      }
    }
  }
}