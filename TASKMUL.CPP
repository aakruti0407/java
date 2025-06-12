#include<iostream.h>
#include<conio.h>

class A
{
	int a;
	public:
		 void getA()
		 {
		     cout<<"\nEnter A: ";
		     cin>>a;
		 }
		 void putA()
		 {
		    cout<<"\nA : "<<a;
		 }
};
class B
{
	int b;
	public:
		 void getB()
		 {
		     cout<<"\nEnter B: ";
		     cin>>b;
		 }
		 void putB()
		 {
		    cout<<"\nB : "<<b;
		 }
};
class C :  public A, public B;
{
	int c;
	public:
		 void getC()
		 {
		     cout<<"\nEnter C: ";
		     cin>>c;
		 }
		 void putC()
		 {
		    cout<<"\nC : "<<c;
		 }
};

void main()
{
    C c1;
    clrscr();
    c1.getA();
    c1.getB();
    c1.getC();
    c1.getA();
    c1.getB();
    c1.getC();
    getch();
}

