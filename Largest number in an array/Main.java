#include<stdio.h>
int main()
{
  //fill the codet 
  int n;
  scanf("%d",&n);
 int arr[n];
  int max=arr[0];
  for(int i=0;i<=(n-1);i++)
  {
    scanf("%d",&arr[i]);
  }
 for(int j=1;j<=n-1;j++)
  {
   if(max<arr[j])
    max=arr[j];
  }
  printf("%d",max);
  return 0;
}