package corejava;
class A11
{
	A11()
	{
		System.out.println("A1's Default Constructor");
	}
	void show()
	{
		System.out.println("show from A1");
	}
}
class B11 extends A11
{
	B11()
	{
		System.out.println("B11's Dfault Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("show from B11");
	}
}
class C11 extends B11
{
	C11()
	{
		System.out.println("C11's Dfault Constructor");
	}
	void show()
	{
		super.show();
		System.out.println("show from c11");
	}
}

public class runtimepoly {
	public static void main(String[] args) {
		C11 c=new C11();
		c.show();
	}

}
