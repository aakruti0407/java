#include<iostream.h>
#include<conio.h>

class Tops
{
	int a,b,c;
	public:
		 void getData(int x,int y,int z)
		 {
			 a=x;
			 b=y;
			 c=z;
		 }
		 void showData()
		 {
			cout<<"\nA : "<<a<<"\nB : "<<b<<"\nC : "<<c;
		 }
		 void operator-()
		 {
		     a=-a;
		     b=-b;
		     c=-c;
		 }
};
void main()
{
	   clrscr();
	   Tops t1;
	   t1.getData(10,-20,30);
	   cout<<"\nBefore - Operator Overload";
	   t1.showData();
	   -t1;
	   cout<<"\nAfter - Operator Overload";
	   t1.showData();
	   getch();
}