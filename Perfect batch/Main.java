/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<=(n-1);i++)
  {
    scanf("%d",&arr[i]);
  }
  sumof(arr,n);
  return 0;
}
int sumof(int arr[],int n)
{
  int sum1=0;
  for(int i=0;i<(n/2);i++)
  {
   
    sum1=sum1+arr[i];
  }
  int sum2=0;
  for(int i=(n/2);i<n;i++)
    {
    sum2=sum2+arr[i];
  }
  if(sum1==sum2)
  {
    printf("Perfect Batch");
  }
  else
    printf("Not a Perfect Batch");
}
    
    