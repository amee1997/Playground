#include<stdio.h>
void subset_of_3(int n,int arr[]);
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
  subset_of_3(n,arr);

return 0;
}
void subset_of_3(int n,int arr[])
{
  for(int i=0;i<(n-1);i++)
  {
  for(int j=i+1;j<(n-1);j++)
  {
      for(int k=(j+1);k<=(n-1);k++)
      {
        printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
      }
      
    }
     printf("\n");
  }
 
}
  