package via.pro2.exercises.E1login.client.model;

public interface Model
{
  public void login(String userName, String password)
      throws IllegalStateException, IllegalArgumentException;
}
