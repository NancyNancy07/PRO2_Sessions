package via.pro2.counter;

public class CounterIncrementer implements Runnable
{
  private int updates;

  private Counter1 counter;

  public CounterIncrementer(Counter1 counter, int updates)
  {
    this.updates = updates;
    this.counter = counter;
  }

  @Override public void run()
  {
    for (int i = 0; i < updates; i++)
    {
      counter.increment();
    }
    System.out.println(
        Thread.currentThread().getName() + ": " + counter.getValue());
  }
}
