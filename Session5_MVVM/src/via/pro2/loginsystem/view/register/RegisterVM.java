package via.pro2.loginsystem.view.register;

import javafx.beans.Observable;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import via.pro2.loginsystem.model.entities.User;
import via.pro2.loginsystem.model.services.authentication.AuthenticationService;

public class RegisterVM
{
  private final StringProperty emailProp = new SimpleStringProperty();
  private final StringProperty pwProp = new SimpleStringProperty();
  private final StringProperty repeatProp = new SimpleStringProperty();
  private final StringProperty msgProp = new SimpleStringProperty();
  private final BooleanProperty rgstrBtnEnabledProp = new SimpleBooleanProperty();
  private final AuthenticationService authenticationService;

  public RegisterVM(AuthenticationService authService)
  {
    this.authenticationService = authService;
    emailProp.addListener(this::updateRegisterButtonState);
    pwProp.addListener(this::updateRegisterButtonState);
    repeatProp.addListener(this::updateRegisterButtonState);

    String resultMsg = authService.registerUser(new User(emailProp.get(), pwProp.get()));

    if (resultMsg.equals("Ok"))
    {
      msgProp.set("Success");
      emailProp.set("");
      pwProp.set("");
      repeatProp.set("");
    }
    else
    {
      msgProp.set(resultMsg);
    }
  }

  public void registerUser()
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

    if (!repeatProp.get().equals(pwProp.get()))
    {
      msgProp.set("Password does not match");
      return;
    }

    System.out.println("User registered");
    msgProp.set("Success");

    //    clearing fields
    emailProp.set("");
    pwProp.set("");
    repeatProp.set("");
  }

  private void updateRegisterButtonState(Observable observable)
  {
    boolean shouldDisabled =
        emailProp.get().isEmpty() || emailProp.get().isEmpty() || pwProp.get()
            .isEmpty() || pwProp.get() == null || repeatProp.get().isEmpty()
            || repeatProp.get() == null;

    rgstrBtnEnabledProp.set(shouldDisabled);
    System.out.println(shouldDisabled);
  }

  //  getters
  public StringProperty emailPropProperty()
  {
    return emailProp;
  }

  public StringProperty pwPropProperty()
  {
    return pwProp;
  }

  public StringProperty repeatPropProperty()
  {
    return repeatProp;
  }

  public StringProperty msgPropProperty()
  {
    return msgProp;
  }

  public BooleanProperty RgstrBtnEnabledProp()
  {
    return rgstrBtnEnabledProp;
  }
}
