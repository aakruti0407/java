#include<iostream.h>
#include<conio.h>

void main()
{
   int a,b,c;
   clrscr();
   cout<<"\nEnter A:";
   cin>>a;
   cout<<"\nEnter B:";
   cin>>b;
   cout<<"\nEnter C:";
   cin>>c;
   if(a>b)
   {
       if(a>c)
       {
	    cout<<"\nA is MAx";
       }
       else
       {
	    cout<<"\nC is Max";
       }
   }
   if(b>c)
     {
	   cout<<"\nB is Max";
	}
	else
	{
	   cout<<"\nC is Max";
	}
	getch();
     }