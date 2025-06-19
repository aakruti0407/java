#include<iostream.h>
#include<conio.h>

class student
{
       private:
		  int marks;
		  int id;
		  string name;
       public:
		  static void staticfunc()
		  {
		     cout<<"static function executed successfully"<<endl;
		  }
};

int main()
{
    student::staticfunc();
    getch();
}