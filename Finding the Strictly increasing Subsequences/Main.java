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
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if(arr[j]>arr[i]&&(arr[j]>arr[j-1]))
      {
        printf("%d,%d\n",arr[i],arr[j]);
      }
    }
  }
      return 0;
}