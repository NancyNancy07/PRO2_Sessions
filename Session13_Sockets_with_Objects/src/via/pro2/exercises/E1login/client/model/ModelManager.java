package via.pro2.exercises.E1login.client.model;

import via.pro2.exercises.E1login.client.mediator.UserClient;

import java.io.IOException;

public class ModelManager implements Model
{
  private UserClient userClient;

  public ModelManager(String host, int port) throws IOException
  {
    this.userClient = new UserClient(host, port);
  }

  @Override public void login(String userName, String password)
      throws IllegalStateException, IllegalArgumentException
  {
    userClient.login(userName, password);

  }
}
