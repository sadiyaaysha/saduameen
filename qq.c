#include <stdio.h>

int main(void) {
	int n;
	scanf("%d",&n);
	int a[n];
	int i;
	int avg=0;
	int sum=0;
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
	sum=sum+a[i];
	}
	avg=sum/n;
	printf("%d",avg);
	return 0;
}
