#include<stdio.h>
#include<conio.h>

void swap(int *a,int *b)
{
     int temp=*a;
     *a=*b;
     *b=temp;
}

void main()
{
     int x,y;
     clrscr();
     printf("\nEnter value:");
     scanf("%d",&x);
     printf("\nEnter value:");
     scanf("%d",&y);
     printf("\nValue Before exchange Is%d & %d",x,y);
     swap(&x,&y);
     printf("\nValue Before After Is %d & %d",x,y);
     getch();
}