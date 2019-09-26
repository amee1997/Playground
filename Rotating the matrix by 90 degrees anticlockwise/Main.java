#include<stdio.h>
int main()
{
	int k,l;
  scanf("%d%d",&k,&l);
  int matrix[k][l];
  for(int i=0;i<k;i++)
  {
    for(int j=0;j<l;j++)
    {
      scanf("%d",&matrix[i][j]);
    }
  }
  for(int i=l-1;i>=0;i--)
  {
    for(int j=0;j<=k-1;j++)
    {
      printf("%d ",matrix[j][i]);
    }
    printf("\n");
  }
  return 0;
}