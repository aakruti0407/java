package corejava;

interface ifs1
{
	void math1();
}
interface ifs2
{
	void math2();
}


public class interfacedemo  implements ifs1,ifs2{

	
	public void math1() {
		System.out.println("Math1");
		
	}

	
	public void math2() {
	System.out.println("Math2");
		}
	public static void main(String[] args) {
		 interfacedemo i=new interfacedemo();
		 i.math1();
		 i.math2();
	}
	

}
