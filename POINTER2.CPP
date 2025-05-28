#include<stdio.h>
#include<conio.h>

void printline()
{
     int i;
     for(i=0;i<50;i++)
     {
	printf("*");
     }
}

void main()
{
     clrscr();
     printline();
     printf("\nWelcome to user defined function in c\n");
     printline();
     getch();
}