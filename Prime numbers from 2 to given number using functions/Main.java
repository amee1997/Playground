#include<stdio.h>
int prime(int n)
  {
  int c=0;
   for(int j=1;j<=n;j++)
  {
    if(n%j==0)
      c++;
      }
  if(c==2)
    printf("%d\n",n);
}
  int main(){
  int num;
  scanf("%d",&num);
       for(int i=2;i<=num;i++)
       {
  prime(i);
       }
   return 0;
     }