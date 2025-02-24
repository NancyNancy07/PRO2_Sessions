package via.pro2.loginsystem.model.services.authentication;

import via.pro2.loginsystem.model.entities.User;

import java.util.ArrayList;

public class AuthenticationServiceImp implements AuthenticationService
{
  private ArrayList<User> users = new ArrayList<>();

  @Override public String registerUser(User newUser)
  {
    users.add(newUser);
    return "Ok";
  }

  @Override public String login(LoginRequest request)
  {
    for (User user : users)
    {
      if (user.getEmail().equals(request.getEmail()))
      {
        if (user.getPassword().equals(request.getPassword()))
        {
          return "Ok";
        }
        return "Incorrect Password";
      }
    }
    return "Email not found";
  }
}
