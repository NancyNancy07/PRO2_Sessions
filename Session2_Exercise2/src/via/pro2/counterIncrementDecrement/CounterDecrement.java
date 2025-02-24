package via.pro2.counterIncrementDecrement;

public class CounterDecrement implements Runnable
{
  private Counter counter;
  private int updates;

  public CounterDecrement(Counter counter, int updates)
  {
    this.counter = counter;
    this.updates = updates;
  }

  public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.decrement();
    }
    System.out.println(
        Thread.currentThread().getName() + ": " + counter.getValue());
  }
}
