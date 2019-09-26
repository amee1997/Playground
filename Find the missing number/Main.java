#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int j=0;j<n;j++)
  {
    int found=0;
    int k=0;
    for(int i=0;i<n;i++)
    {
     k=arr[i];
      if(j==k)
      {
        found=1;
      }
    }
    if(found==0)
    {
      printf("%d",j);
    }
  }
   return 0;
}