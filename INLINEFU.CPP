#include<iostream.h>
#include<conio.h>

inline square (int a)
{
    return a*a;
}
inline cube (int x)
{
    return x*x*x;
}

void main()
{
	   clrscr();
	   cout<<"\nsquare of "<<5<<" Is "<<square(5);
	   cout<<"\ncube of "<<5<<" Is "<<cube(5);
	   getch();
}