#include <stdio.h>

int main()
{
    int year;

    printf("");
    scanf("%d",&year);

    if(year%4 == 0)
    {
        if( year%100 == 0)
        {
            
            if ( year%400 == 0)
                printf("%d yes", year);
            else
                printf("%d no", year);
        }
        else
            printf("%d yes", year );
    }
    else
        printf("%d no", year);
    
    return 0;
}
