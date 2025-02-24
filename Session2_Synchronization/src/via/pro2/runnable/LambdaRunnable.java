package via.pro2.runnable;

public class LambdaRunnable
{
  public static void main(String[] args)
  {
    Runnable myLambdaRunnable = () -> System.out.println(
        "This is from Lambda runnable");
    Thread t1 = new Thread(myLambdaRunnable);
    t1.start();
  }
}
