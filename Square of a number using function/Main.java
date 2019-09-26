#include<stdio.h>
int squ(int n)
{
  int z;
  z=n*n;
  return z;
}
 int main() {
   // Type your code here
   int num;
   scanf("%d",&num);
   int s=squ(num);
   printf("%d",s);
   return 0;
}