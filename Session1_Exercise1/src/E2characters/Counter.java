package E2characters;

public class Counter
{
  private long value;
  private long max;
  private long min;

  public synchronized void increment()
  {
    while (value >= max)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        System.out.println("Thread Interrupted");
      }
      value++;
      notifyAll();
    }
  }
  public synchronized void decrement()
  {
    while (value <= min)
    {
      try
      {
        wait();
      }
      catch (InterruptedException e)
      {
        System.out.println("Thread Interrupted");
      }
      value++;
      notifyAll();
    }
  }
}
