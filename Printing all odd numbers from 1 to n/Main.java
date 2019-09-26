#include <stdio.h>
int main() {
	//Type your code
  int i,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      printf("%d",i);
      printf("\n");
      i++;
     }
  }
	return 0;
}