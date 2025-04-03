package via.pro2.loginsystem.view.login;

import javafx.beans.Observable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import via.pro2.loginsystem.model.services.authentication.AuthenticationService;
import via.pro2.loginsystem.model.services.authentication.LoginRequest;

public class LoginVM
{
  private final StringProperty emailProp = new SimpleStringProperty("");
  private final StringProperty pwProp = new SimpleStringProperty("");
  private final StringProperty msgProp = new SimpleStringProperty("");
  private final BooleanProperty loginBtnEnabledProp = new SimpleBooleanProperty(true);

  private final AuthenticationService authenticationService;

  public LoginVM(AuthenticationService authService)
  {
    this.authenticationService = authService;
    emailProp.addListener(this::updateLoginButtonState);
    pwProp.addListener(this::updateLoginButtonState);

    String resultMsg = authService.login(
        new LoginRequest(emailProp.get(), pwProp.get()));

    if (resultMsg.equals("Ok"))
    {
      msgProp.set("");
      emailProp.set("");
      pwProp.set("");
    }
    else
    {
      msgProp.set(resultMsg);
    }
  }

  public void loginUser()
  {
    //    validate data
    if (emailProp.get() == null || emailProp.get().isEmpty())
    {
      msgProp.set("Email cannot be empty.");
      return;
    }

    if (pwProp.get() == null || pwProp.get().isEmpty())
    {
      msgProp.set("Password cannot be empty.");
      return;
    }

    System.out.println("User Logged In");
    msgProp.set("You are successfully Logged in!");

    //    clearing fields
    emailProp.set("");
    pwProp.set("");
    msgProp.set("");
  }

  private void updateLoginButtonState(Observable observable)
  {
    boolean shouldDisabled =
        emailProp.get().isEmpty() || emailProp.get().isEmpty() || pwProp.get()
            .isEmpty() || pwProp.get() == null ;

    loginBtnEnabledProp.set(shouldDisabled);
    System.out.println(shouldDisabled);
  }
  public StringProperty emailPropProperty()
  {
    return emailProp;
  }

  public StringProperty pwPropProperty()
  {
    return pwProp;
  }

  public StringProperty msgPropProperty()
  {
    return msgProp;
  }

  public BooleanProperty loginBtnEnabledProp()
  {
    return loginBtnEnabledProp;
  }

}
