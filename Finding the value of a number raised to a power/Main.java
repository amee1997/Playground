import java.util.Scanner;
import java.lang.Math; 
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      double b = sc.nextInt();
      double e = sc.nextInt();
      double res = power(b,e);
      System.out.println(res);
    }
 public static double power(double a, double b)
 {
   double z = Math.pow(a,b);
   return z;
 }}