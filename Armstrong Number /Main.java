#include <stdio.h>
int main() {
	//Type your code
  int num,count=0,sum=0,d,n,r;
  scanf("%d",&num);
  int z=num;
   n=num;
    while(num!=0)
    {
      num=num/10;
      count++;
    }
  while(z!=0)
  {
    d=z%10;
    r=pow(d,count);
    sum=sum+r;
    z=z/10;
  }
  if(n==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
    
	return 0;
}