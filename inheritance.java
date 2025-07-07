package corejava;

import java.util.Scanner;

class A
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A :");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A :"+a);
	}
}
class B extends A
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter B :");
		b=sc.nextInt();
		
	}
	void putB()
	{
		System.out.println("B :"+b);
	}
}
class C extends A
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter C :");
		c=sc.nextInt();
		
	}
	void putc()
	{
		System.out.println("C :"+c);
	}
}
class D extends A
{
	int D;
	void getD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter D :");
		D=sc.nextInt();
		
	}
	void putd()
	{
		System.out.println("D :"+D);
	}
}


public class inheritance {
	public static void main(String[] args) {
		B b1=new B();
		C c1=new C();
		D d1=new D();
		b1.getA();
		b1.getB();
		c1.getC();
		d1.getD();
		b1.putA();
		b1.putB();
		c1.putc();
		d1.putd();
	}

}
