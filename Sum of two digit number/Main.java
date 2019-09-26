#include<stdio.h>
int main()
{
  //Type your code here
  int a,num,sum;
  scanf("%d",&a);
  sum=a%10;
  num=a/10;
  printf("%d",num+sum);
  return 0;
}