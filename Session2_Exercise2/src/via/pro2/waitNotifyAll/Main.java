package via.pro2.waitNotifyAll;

public class Main
{
  public static void main(String[] args)
  {
    BurgerBar burgerBar = new BurgerBar(10);

    BurgerBarEmployee em1 = new BurgerBarEmployee("Steve", burgerBar);
    BurgerBarEmployee em2 = new BurgerBarEmployee("John", burgerBar);

    BurgerBarCustomer cus1 = new BurgerBarCustomer("Cus1", burgerBar, 2);
    BurgerBarCustomer cus2 = new BurgerBarCustomer("Cus2", burgerBar, 1);
    BurgerBarCustomer cus3 = new BurgerBarCustomer("Cus3", burgerBar, 3);
    BurgerBarCustomer cus4 = new BurgerBarCustomer("Cus4", burgerBar, 4);
    BurgerBarCustomer cus5 = new BurgerBarCustomer("Cus5", burgerBar, 5);

    Thread t1 = new Thread(em1);
    Thread t2 = new Thread(em2);
    Thread t3 = new Thread(cus1);
    Thread t4 = new Thread(cus2);
    Thread t5 = new Thread(cus3);
    Thread t6 = new Thread(cus4);
    Thread t7 = new Thread(cus5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();

  }
}
