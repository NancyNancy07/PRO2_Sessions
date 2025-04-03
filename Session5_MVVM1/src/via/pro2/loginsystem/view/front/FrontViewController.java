package via.pro2.loginsystem.view.front;

import via.pro2.loginsystem.view.ViewHandler;

public class FrontViewController
{
  public void onLogin()
  {
    System.out.println("Not yet implemented");
    ViewHandler.showView(ViewHandler.ViewType.LOGIN);
  }

  public void onRegister()
  {
    ViewHandler.showView(ViewHandler.ViewType.REGISTER);
  }
}
