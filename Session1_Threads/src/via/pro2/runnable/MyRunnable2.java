package via.pro2.runnable;

public class MyRunnable2 implements Runnable
{
  @Override public void run()
  {
    moveOn();
  }

  public void moveOn()
  {
    moreMoves();
  }

  public void moreMoves()
  {
    System.out.println(Thread.currentThread().getName() + ": top of the stack");
//    Thread.dumpStack();
  }
}

