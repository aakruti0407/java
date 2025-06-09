#include<iostream.h>
#include<conio.h>

class A
{
      public :
	       A()
	       {
		  cout<<"\nA's Default Constructor ";
	       }
};
class B : public A
{
   public :
	     B()
	     {
		 cout<<"\nB's Default Constuctor  ";
	     }
};
class C : public B
{
      public :
	       C()
	       {
		  cout<<"\nC's Default Constuctor ";
	       }
 };

 void main()
{
	 clrscr();
	 C c1;
	 getch();
}