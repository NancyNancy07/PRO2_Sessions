package via.pro2.counterIncrementDecrement;

public class Main
{
  public static void main(String[] args)
  {
    Counter counter = new Counter(0, 10);

    CounterIncrement cI1 = new CounterIncrement(counter, 200);
    CounterIncrement cI2 = new CounterIncrement(counter, 200);

    CounterDecrement cD1 = new CounterDecrement(counter, 200);
    CounterDecrement cD2 = new CounterDecrement(counter, 200);

    Thread t1 = new Thread(cI1);
    Thread t2 = new Thread(cI2);
    Thread t3 = new Thread(cD1);
    Thread t4 = new Thread(cD2);

    t1.start();
    t2.start();
    t3.start();
    t4.start();

    System.out.println("Finished");

  }
}
