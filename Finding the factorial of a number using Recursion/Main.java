#include<stdio.h>
int fact(int x);
int main()
{
  int a;
  scanf("%d",&a);
  printf("%d",fact(a));
}
int fact(int x)
{
  if(x>=1)
  return x*fact(x-1);
  else
    return 1;
  return 0;
}