#include <stdio.h>
int great(int n1,int n2)
{
  int z;
  if((n1>n2)&&(n1>z))
  printf("%d",n1);
  else if((n2>n1)&&(n2>z))
    printf("%d",n2);
}
int main(){
	 int a,b,z;
  scanf("%d%d",&a,&b);
  z=great(a,b);
          }