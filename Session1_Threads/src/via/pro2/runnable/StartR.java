package via.pro2.runnable;

public class StartR
{
  public static void main(String[] args)
  {
    MyFirstRunnable myFirstRunnable = new MyFirstRunnable();
    Thread thread = new Thread(myFirstRunnable);
    thread.start();
  }
}
