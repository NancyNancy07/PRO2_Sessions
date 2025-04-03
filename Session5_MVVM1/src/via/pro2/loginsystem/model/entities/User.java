package via.pro2.loginsystem.model.entities;

public class User
{
  private String email;
  private String password;

  public User(String email, String password)
  {
    this.email = email;
    this.password = password;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPassword()
  {
    return password;
  }
}
