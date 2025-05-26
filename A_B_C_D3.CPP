#include<stdio.h>
#include<conio.h>

void main()
{
     int a,b;
     clrscr();
     printf("\nEnter A:");
     scanf("%d",&a);
     printf("\Enter B:");
     scanf("%d",&b);
     if(a>b)
     {
       printf("\A is max number");
     }
     else
     {
       printf("\nB is max number");
     }
     getch();
}