package corejava;
class Student
{
	int rno;
	String sname;
	public Student()
	{
		System.out.println("Default Constructor Called");
	}
	public Student(int rno,String sname)
	{
		this();
		System.out.println("Parameterized Constructer Called");
		this.rno=rno;
		this.sname=sname;
	}
	void show()
	{
		System.out.println("Roll No :"+rno);
		System.out.println("Student Name :"+sname);
	}
}

public class thisdemo {
	public static void main(String[] args) {
		Student s1=new Student(1,"Aakruti");
		s1.show();
	}

}
