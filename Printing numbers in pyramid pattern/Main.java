#include <stdio.h>
int main() {
	// Type your code here
  int i,j,n,space;
  scanf("%d",&n);
  int r=1;
  for(i=1;i<=n;i++)
  {
    
    for(space=1;space<=(n-i);space++)
    {
      printf(" ");
    }
    for(j=1;j<=i;j++)
    {
      printf("%d ",r);
      r++;
    }
    printf("\n");
  }
	return 0;
}