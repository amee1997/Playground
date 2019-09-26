#include<stdio.h>
#include<string.h>
//#include<conio.h>
int main()
{
  //Type your code here
  //int n;
  //scanf("%d",&n);
  char str[100],revstr[100];
  
  gets(str);
  int len=strlen(str);
  int end=len-1;
  for(int i=0;i<len;i++)
  {
    revstr[i]=str[end];
    end--;
  }
 int a=strcmp(str,revstr);
  if(a==0)
  {
    printf("%s is a palindrome",str);
  }
  else{
    printf("%s is not a palindrome",str);
  }
  return 0;
}