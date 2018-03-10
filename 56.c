#include <stdio.h>
#include<string.h>
int main(void) {
	char a[10];
	scanf("%[^\n]s",a);
	int i;
	int c=0;
	int k=0;
		for(i=0;i<strlen(a);i++)
	{
		if((a[i]>=65&&a[i]<=90)||(a[i]>=97&& a[i]<=122))
		{
		c=1;
		}
	}
		for(i=0;i<strlen(a);i++)
	{
		if(a[i]>='0'&&a[i]<='9')
		{
		k=1;
		}
	}
	if(c==1&&k==1)
	{
	printf("yes");
	}
	else
	{
printf("no");
}
	
	return 0;
}
