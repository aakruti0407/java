#include<iostream.h>
#include<conio.h>

using namespace std;
void swapv(int x, int y);

int main()
{
    int a=2,b=4;
    swapv(a,b);
    cout<<"a="<<"b="<<b;

    return=0;
}

void swapv(int x, int y)
{
   int t;
   t = x;
   x = y;
   y = t;
   cout<<"x ="<<x <<" y =' <<y;
   getch();
}
