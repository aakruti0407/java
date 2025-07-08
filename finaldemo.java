package corejava;
class F1
{
	final int a;
	
	public F1()
	{
		a=10;
	}
	void show()
	{
		
	}
}
class F2 extends F1
{
	void show()
	{
		
	}
}
public class finaldemo {
	public static void main(String[] args) {
		F2  f=new F2();
		f.show();
	}

}
