package via.pro2.loginsystem.model.services.authentication;

import via.pro2.loginsystem.model.entities.User;

public interface AuthenticationService
{
  String registerUser(User newUser);
  String login(LoginRequest request);
}
