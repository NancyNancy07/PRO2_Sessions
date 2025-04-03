package via.pro2.exercises.E4Sleep;

public class SleepLambda
{
  public static void main(String[] args)
  {
    long count = 5;
    Runnable sleepLam = () -> {
      for (int i = 0; i < count; i++)
      {
        System.out.println(i);
        try
        {
          Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
          System.out.println("Thread Interrupted");
        }
      }
    };

    Thread t1 = new Thread(sleepLam);
    t1.start();
  }
}
