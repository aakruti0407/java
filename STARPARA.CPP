#include<iostream.h>
#include<conio.h>

void main()
{
     int i,j,k;
     clrscr();
     for(i=0;i<10;i++)
     {
       for(j=0;j<9-i;j++)
       {
	 cout<<" ";
       }
       for(k=0;k<=i;k++)
       {
	  cout<<" *";
       }
       cout<<"\n";
     }
     getch();
}
{
  int i,j,k;
     clrscr();
     for(i=10;i<0;i--)
     {
       for(k=0,k<=i,k++)
       {
	 cout<<" ";
       }
       for(j=0,j<=i,j++)
       {
	  cout<<" *";
       }
       cout<<"\n";
     }
     getch();
}