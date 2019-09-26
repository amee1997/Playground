#include<stdio.h>
int main()
{
	int k,l,i,j;
  scanf("%d%d",&k,&l);
  int matrix1[k][l];
  int matrix2[k][l];
  int sub[k][l];
  for(i=0;i<k;i++)
  {
    for(j=0;j<l;j++)
    {
      scanf("%d",&matrix1[i][j]);
    }
  }
  for(i=0;i<k;i++)
  {
    for(j=0;j<l;j++)
    {
      scanf("%d",&matrix2[i][j]);
    }
  }
    for(i=0;i<k;i++)
  {
    for(j=0;j<l;j++)
    {
      sub[i][j]=matrix1[i][j]-matrix2[i][j];
    }
  }
   for(i=0;i<k;i++)
  {
    for(j=0;j<l;j++)
    {
      printf("%d ",sub[i][j]);
    }
     printf("\n");
  }
  
	return 0;
}