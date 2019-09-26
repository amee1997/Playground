#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,c=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<=(n-1);i++)
  {
    scanf("%d",&arr[i]);
  }
  int a,b;
  scanf("%d%d",&a,&b);
  int k1=-1,k2=-1;
  for(i=0;i<=(n-1);i++)
    {
    if(a==arr[i])
    {
      k1=i;
    }
    if(b==arr[i])
       {
         k2=i;
       }
  }
    printf("%d\n%d",k1,k2);
  return 0;
}