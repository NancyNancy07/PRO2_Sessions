package E4Sleep;

public class SleepRunnable implements Runnable
{
  private int count;

  public SleepRunnable(int count)
  {
    this.count = count;
  }

  public void run()
  {
    synchronized (this)
    {
      for (int i = 0; i < count; i++)
      {
        System.out.println(i);
        try
        {
          Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
          System.out.println("Thread interrupted");
        }
      }
    }

  }
}

