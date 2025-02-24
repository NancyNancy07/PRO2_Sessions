package via.pro2.counter;

public class CounterStart
{
  public static void main(String[] args)
  {
    Counter counter = new Counter();

    CounterIncrementer counterIncrementer = new CounterIncrementer(counter, 200000);
    CounterIncrementer counterIncrementer2 = new CounterIncrementer(counter, 200000);

    Thread t1 = new Thread(counterIncrementer, "Increment1");
    Thread t2 = new Thread(counterIncrementer2, "Increment2");

    t1.start();
    t2.start();


    System.out.println(Thread.currentThread().getName() + ": " + counter.getValue());
  }
}
