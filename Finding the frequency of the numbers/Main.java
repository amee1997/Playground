#include<stdio.h>
int main()
{
  int n,k;
  scanf("%d%d",&n,&k);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(int j=1;j<=k;j++)
  {
    int count=0;
    int w=0;
    for(int i=0;i<n;i++)
    {
      w=arr[i];
      if(j==w)
      {
        
        count++;
      }
    }
    
      printf("%d %d\n",j,count);
    
    }
  
  return 0;
}