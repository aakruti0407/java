#include<stdio.h>
#include<conio.h>

void add(int a,int b)
{
     printf("\nAddition:%d",a+b);
}

void main()
{
     int x,y;
     clrscr();
     printf("\nEnter value:");
     scanf("%d",&x);
     printf("nEnter value:");
     scanf("%d",&y);
     add(x,y);
     getch();
}