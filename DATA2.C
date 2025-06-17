#include<stdio.h>
#include<conio.h>

void main()
{
     int a,b,c;
     clrscr();
     printf("\nEnter value of A:");
     scanf("%d", &a);
     printf("\nEnter value of B:");
     scanf("%d", &b);
     c=a+b;
     printf("\nAddition of %d & %d Is : %d",a,b,c);
     c=a-b;
     printf("\nSubtraction of %d & %d Is : %d",a,b,c);
     c=a*b;
     printf("\nMultiplication of %d & %d Is : %d",a,b,c);
     c=a/b;
     printf("\nDivision of %d & %d Is : %d",a,b,c);
     getch();
}