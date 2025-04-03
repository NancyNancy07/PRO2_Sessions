import model.Item;
import model.ItemList;

public class Main
{
  public static void main(String[] args)
  {
    ItemList itemList = new ItemList();

    Item item1 = new Item("Vase", 2000);
    Item item2 = new Item("Painting", 3000);
    Item item3 = new Item("Chair", 1000);
    Item item4 = new Item("Bed", 5000);

    itemList.addItem(item1);
    itemList.addItem(item2);
    itemList.addItem(item3);
    itemList.addItem(item4);



  }
}
