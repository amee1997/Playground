#include<stdio.h>
int sum(int x);
int main()
{
  int a;
  scanf("%d",&a);
  printf("%d",sum(a));
}
int sum(int x)
{
  if(x>1)
  return x+sum(x-1);
  else
    return 1;
  return 0;
}