#include<stdio.h>
#include<string.h>
int main()
{
  char str1[1000],str2[1000];
  gets(str1);
  gets(str2);
  int s1=strlen(str1);
  int s2=strlen(str2);
  for(int i=0;str1[i]!='\0';i++)
  {
    if(str1[i]>='a'&&str1[i]<='z')
    {
      str1[i]=str1[i]-32;
    }
  }
  for(int i=0;str2[i]!='\0';i++)
  {
    if(str2[i]>='a'&&str2[i]<='z')
    {
      str2[i]=str2[i]-32;
    }
  }
  int matching_idx=0;
  for(int i=0;i<(s1-s2+1);i++)
  {
    int k=1;
    for(int j=0;j<s2;j++)
    {
      if(str1[i+j]!=str2[j])
      {
        k=0;
      }
    }
    if(k==1)
    {
      matching_idx++;
      }
  }
  printf("%d",matching_idx);
  return 0;
}
