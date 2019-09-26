#include<stdio.h>
int main()
{
	//Try out your code here
  int n1,n2;
  scanf("%d%d",&n1,&n2);
  int matrix1[n1][n2];
  int matrix2[n1][n2];
  int count=0;
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&matrix1[i][j]);
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      scanf("%d",&matrix2[i][j]);
    }
  }
  for(int i=0;i<n1;i++)
  {
    for(int j=0;j<n2;j++)
    {
      if(matrix1[i][j]==matrix2[i][j])
      {
        count++;
      }
    }
  }
  if(count==(n1*n2))
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
        
	return 0;
}