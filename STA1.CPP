#include<iostream.h>
#include<conio.h>

class student
{
		  int marks;
		  int id;
       public:
		  static void staticfunc()
		  {
		     cout<<"static function executed successfully";
		  }
};

void main()
{
	clrscr();
	student::staticfunc();
	getch();
}