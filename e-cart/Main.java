import java.util.Scanner;
import java.util.*;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  
}
   
class Customer
{
  private String product;
  private int quantity;
  private int price;
  //create various method to return attribute value(s)
}

class Bill
{
   int price;
   int quantity;
   public void tAmount(int quantity,int price)
  {
    int amount = price*quantity;
    System.out.println("Total Price is : " +amount);
  }
    }
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String pdt = sc.nextLine();
    int quantity = sc.nextInt();
    int price = sc.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    obj.tAmount(quantity,price);
    //write the logic here
  }
}