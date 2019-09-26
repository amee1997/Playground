#include<stdio.h>
#include<string.h>
int main()
{
	char str[100];
  scanf("%[^\n]s",str);
  int i,j;
  int len=strlen(str);
  int count;
  for(i=0;i<len;i++)
  {
    count=0;
    for(j=0;j<len;j++)
    {
      if((str[i]==str[j])&&(i!=j))
         {
          count=1;
         }
      }
    if(count==0)
      {
    printf("%c",str[i]);
      break;
      }
    }
   if(count==1)
    {
  printf("All the characters are repetitive");
    }
  return 0;
}
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
  
	