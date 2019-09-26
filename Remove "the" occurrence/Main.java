#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  int i,j;
  char res[100];
  int len=strlen(str);
  int idx=0;
  for(i=0;str[i]!='\0';i++)
  {
   
      if((str[i]=='T'||'t')&&(str[i+1]=='h')&&(str[i+2]=='e'))
         {
          i=i+3;
         }
      else
      {
       
          res[idx]=str[i];
          idx++;
          //printf("%s",str);
      }  
      }
  res[idx]='\0';
   printf("%s",res);
  
        return 0;
}