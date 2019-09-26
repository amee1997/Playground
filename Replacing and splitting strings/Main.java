import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc = new Scanner(System.in);
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      int c = sc.nextInt(); 
      String res = (str1.replace(str1,str2));
      String[] arr = res.split("\\s");
      for (String value : arr) 
      {
        System.out.println(value); 
      }
    }
}