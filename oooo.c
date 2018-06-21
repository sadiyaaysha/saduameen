//gcc 5.4.0

#include  <stdio.h>
#include<string.h>
int main(void)
{
    char w[10];
    scanf("%s",w);
      int i;
        for(i=0;i<strlen(w);i++)
        {
            int r=(int)w[i]+3;
            printf("%c",r);
        
    }
    return 0;
}
