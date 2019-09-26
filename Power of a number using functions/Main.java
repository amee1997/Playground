#include<stdio.h>
int pow(int base,int exponent)
{
  int power=1;
  while(exponent>=1)
  {
    power=power*base;
    exponent--;
   }
  return power;
}
  int main(){
  int base,exponent,z;
  scanf("%d%d",&base,&exponent);
  z= pow(base,exponent);
  printf("%d",z);
 	return 0;
}