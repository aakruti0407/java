#include<iostream.h>
#include<conio.h>

class Tops
{
      public :
		void test()
	       {
		  cout<<"\ntest with no argument ";
	       }
	       void test ( int a )
	       {
		  cout<<"\ntest with 1 argument ";
	       }
	       void test ( int a,int b)
	       {
		  cout<<"\ntest  with 2 argument ";
	       }
};
void main()
{
	Tops T1;
	clrscr();
	T1.test(10,20);
	T1.test(10);
	T1.test();
	getch();
}