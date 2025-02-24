package E3counter;

public class CounterIncrementer implements Runnable
{
  private int updates;
  private Counter counter;

  public CounterIncrementer(Counter counter, int updates)
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
