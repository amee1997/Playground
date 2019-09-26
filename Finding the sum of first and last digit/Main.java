#include <stdio.h>
int main() {
	//Type your code
  int n,r,sum=0;
  scanf("%d",&n);
   int last_digit=n%10;
   while(n>10)
  {
    
     n=n/10;
   }
 int first_digit=n;
  r=last_digit+first_digit;
     printf("%d",r);
	return 0;
}