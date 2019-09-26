import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
     int b,c;
      b = a/100;
      c = a%10;
      System.out.println(b+c);
	}
}