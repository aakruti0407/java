package corejava;
abstract class Abs1
{
	void math1()
	{
		System.out.println("Math1");
	}
	abstract void math2();
}
class Abs2 extends Abs1
{
	void math2()
	{
		System.out.println("Math2  Defined In Abs2");
	}
}

public class abstractclass {
	public static void main(String[] args) {
		Abs2 a=new Abs2();
		a.math1();
		a.math2();
	}

}
