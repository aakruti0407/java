#include<stdio.h>
#include<conio.h>

void main()
{
     int n;
     clrscr();
     printf("\Enter N");
     scanf("%d",&n);
     do
     {
       printf("\Tops Technologies");
       n--;
     }while(n<0);
     getch();
}