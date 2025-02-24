package via.pro2.waitNotifyAll;

public class BurgerBar
{
  private int numberOfBurgers;
  private int maxNumberOfBurgers;

  public BurgerBar(int maxNumberOfBurgers)
  {
    numberOfBurgers = 0;
    this.maxNumberOfBurgers = maxNumberOfBurgers;
  }

  public synchronized void makeBurger(String employeeName)
      throws InterruptedException
  {
    while (numberOfBurgers >= maxNumberOfBurgers)
    {
      System.out.println(employeeName + " waiting to make burger");
      wait();

    }
    numberOfBurgers++;
    System.out.println("burgers made, total burgers: " + numberOfBurgers);
    notifyAll();
    ;
  }

  public synchronized void eatBurger(String who) throws InterruptedException
  {
    while (numberOfBurgers <= 0)
    {
      System.out.println(who + " waiting to eat burger");
      wait();
    }
    numberOfBurgers--;
    System.out.println("burgers eaten, total burger: " + numberOfBurgers);
    notifyAll();
  }

  public synchronized int getNumberOfBurgers()
  {
    return numberOfBurgers;
  }
}
