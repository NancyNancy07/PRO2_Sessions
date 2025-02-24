package via.pro2.thread;

//example of sleep and join
public class LambdaThread
{
  public static void main(String[] args)
  {
    Thread lt = new Thread(() -> {
      System.out.println("lt started....");
      try
      {
        Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
        //        throw new RuntimeException(e);
        e.printStackTrace();
      }
      System.out.println("lt finished");

    });
    lt.start();

    //    let the main wait
    try
    {
      System.out.println("Main thread- waiting for lt to be done");
      lt.join();
      System.out.println("main thread continues...");
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
