#include<iostream.h>
#include<conio.h>

class Tops
{
       int num;
       static int count;
       public:
		void val_counter()
		{
		    num=++count;
		}
		void obj_counter()
		{
		  cout<<"\nobject Number : "<<num;
		}
		static void display_count()
		{
		   cout<<"\ncount  :"<<count;
		}
};
int Tops :: count;

void main()
{
     clrscr();
     Tops t1,t2;
     t1.val_counter();
     t2.val_counter();
     Tops::display_count();
     Tops t3;
     t3.val_counter();
     Tops::display_count();
     t1.obj_counter();
     t2.obj_counter();
     t3.obj_counter();
     getch();
}