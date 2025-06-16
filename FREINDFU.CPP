#include<iostream.h>
#include<conio.h>

class  XYZ;
class  ABC
{
       int a;
       public:
		void getA()
		{
		      cout<<"\nEnter A : ";
		      cin>>a;
		}
		friend void max(ABC a,XYZ x);
};
class XYZ
{
     int x;
     public:
	      void getX()
	      {
		    cout<<"\nEnter X : ";
		    cin>>x;
	      }
	      friend void max(ABC a,XYZ x);
};
void max(ABC a1,XYZ x1)
{
       if(a1.a>x1.x)
       {
	    cout<<"\nA Is Max";
       }
       else
       {
	    cout<<"\nX Is Max";
       }
}
void main()
{
      clrscr();
      ABC a1;
      XYZ x1;
      a1.getA();
      x1.getX();
      max(a1,x1);
      getch();
}