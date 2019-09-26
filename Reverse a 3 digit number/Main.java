import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int i=0;
    while(a!=0)
    {
      int rem = a%10;
      System.out.print(rem);
      a=a/10;
      i++;
    }
  }
}