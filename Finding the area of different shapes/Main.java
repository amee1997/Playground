import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
      switch(n)
      {
        case 1:
          {
          int a = sc.nextInt();
          int area = a*a;
          System.out.println(area);
            }
          break;
        case 2:
          {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int  area = a*b;
          System.out.println(area);
          }
          break;
        case 3:
          {
          int a = sc.nextInt();
          int b = sc.nextInt();
          int area = (a*b)/2;
          System.out.println(area);
          }
          break;
        case 4:
          {
          int a = sc.nextInt();
          double area = 3.14*a*a;
          System.out.println(area);
          }
          break;
        default:
          System.out.println("Invalid input");
          
          sc.close();
      }    
    }
}