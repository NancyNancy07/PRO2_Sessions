package via.pro2.waitNotifyAll;

public class BurgerBarEmployee implements Runnable
{
  private String name;
  private BurgerBar burgerBar;

  public BurgerBarEmployee(String name, BurgerBar burgerBar)
  {
    this.name = name;
    this.burgerBar = burgerBar;
  }

  public void run()
  {
    while (true)
    {
      try
      {
        burgerBar.makeBurger(name);
      }
      catch (InterruptedException e)
      {
        throw new RuntimeException(e);
      }
      try
      {
        Thread.sleep(1000); // Simulate time to make a burger
      }
      catch (InterruptedException e)
      {
        Thread.currentThread().interrupt();
      }
    }
  }
}
