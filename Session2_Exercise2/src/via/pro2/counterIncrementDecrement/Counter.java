package via.pro2.counterIncrementDecrement;

public class Counter
{
  private long value;
  private long max;
  private long min;

  public Counter(long min, long max)
  {
    this.min = min;
    this.max = max;
    value = 0;
  }

  public synchronized void increment()
  {
    if (value >= min)
    {
      value++;
    }
  }

  public synchronized void decrement()
  {
    if (value <= max)
    {
      value--;
    }
  }

  public synchronized long getValue()
  {
    return value;
  }
}
