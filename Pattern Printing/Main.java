import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      int i,j;
      for(i=1;i<=r;i++)
      {
        int k=0;
        for(j=1;j<=c;j++)
        {
          if(i>j)
          {
            System.out.print(r-k);
            k++;
          }
         else
          {
            System.out.print(r-i+1);
          }
        }
        System.out.println("");
      }
      
    }
}