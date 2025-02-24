package E4Sleep;

public class SleepRunnableTest
{
  public static void main(String[] args)
  {
    Thread t1 = new Thread(new SleepRunnable(10), "Thread 1");
    Thread t2 = new Thread(new SleepRunnable(10), "Thread 2");

    t1.start();
    t2.start();
  }
}
