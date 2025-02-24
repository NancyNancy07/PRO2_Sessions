package via.pro2.runnable;

public class StartR2
{
  public static void main(String[] args)
  {
    Runnable threadJob = new MyRunnable2();
    Thread thread = new Thread(threadJob);
    thread.start();

    System.out.println(Thread.currentThread().getName() + ": back in main");
//    Thread.dumpStack();
  }
}
