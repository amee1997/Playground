#include <stdio.h>
int main() {
    // Type your code here
  int i,j,n,space;
  scanf("%d",&n);
  for(i=n;i>=1;i--)
  {
    int r=i;
    for(j=1;j<=i;j++)
    {
      printf("%d",r);
      r--;
    }
    printf("\n");
  }
	return 0;
}