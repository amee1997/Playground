#include<stdio.h>
int sum(int n)
{
  int z;
  z=(n*(n+1))/2;
  return z;
}
 int main() {
   // Type your code here
   int num;
   scanf("%d",&num);
   int s=sum(num);
   printf("%d",s);

  	return 0;
}