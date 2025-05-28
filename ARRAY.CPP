#include<stdio.h>
#include<conio.h>

void main()
{
     int a[5],i,sum=0;
     clrscr();
     printf("\nEnter Array Elements\n");
     for(i=0;i<5;i++)
     {
	printf("Enter %d Element:",i);
	scanf("%d",&a[i]);
	sum=sum+a[i];
     }
     printf("\nsum:%d",sum);
     printf("\nArray Element are\n");
     for(i=0;i<5;i++)
     {
	  printf("\A[%d]:%d",i,a[i]);
     }
     getch();
}