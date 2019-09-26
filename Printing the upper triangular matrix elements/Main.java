#include<stdio.h>
int main()
{
	int n1,n2;
  scanf("%d%d",&n1,&n2);
  int matrix[n1][n2];
  
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&matrix[i][j]);
    }
  }
  int m,k;
  for(int j=0;j<n2;j++)
  {
    for(int k=0,m=j;m<n2;k++,m++)
    {
      
      printf("%d ",matrix[k][m]);
    }
    
  }
  return 0;
}