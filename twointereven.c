
#include<stdio.h> 

int main(){

           int f1,f2,rem,i;

           printf("");

           scanf("%d",&f1);

           printf("");

           scanf("%d",&f2);

        

           for(i=f1+1; i<f2; i++){

               rem = i % 2;

               if(rem == 0)

               printf("\t  %d",i);

           }

    return 0; 

    } 
