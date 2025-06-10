#include<iostream.h>
#include<conio.h>

Using namespace Std;
class employee
{
     char ename[20];
     int eage;

     public:
	       void collectdata(void);
	       void printdetail(void);
};

void employee :: collectdata(void)
{
   cout<<"\nEnter name of employee :";
   cin>>ename;
   cout<<"\nEnter age of employee :";
   cin>>eage;
}
void employee :: printdetail(void)
{
    cout<<"\nEmployee Name :"<<ename;
    cout<<"\nEmployee Age:"<<eage;
}

int main()
{
    employee e;
    e.collectdata();
    e.printdetail();
return 0;
}