#include<iostream.h>
#include<conio.h>

class clock
{
    int hrs,mints;
    public:
	    void inser_time(int h,m)
	    {
	       hrs=h;
	       mints=m;
	    }
	    void display_time()
	    {
	      cout<<hrs<<"hours &";
	      cout<<mints<<"minutes"<<"\n";
	    }
	      void sum(clock,clock);
};
void clock ::sum (clock t1,clock t2)
{

  {  mints=t1.mints+t2.mints;
    hrs=mints/60;
    mints=mints%60;
    hrs=hrs+t1.hrs+t2.hrs;
  }

    clrscr();
    {
       clock c1,c2,c3;
       c1.insert_time(3,55);
       c2.insert_time(3,45);
       c3.insert_time(c1,c2);

       cout<<"Time1=";  c1.display_time();
       cout<<"Time2=";  c2.display_time();
       cout<<"Time3=";  c3.display_time();
       getch();
    }
}