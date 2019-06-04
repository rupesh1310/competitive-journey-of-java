

public class p14//remove comment and rename file to Student{
	int age;
	int regdno;
	public void getdata(int x,int y)
	{
		age = x;
		regdno = y;
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.getdata(10,20);
		System.out.println(s1.age);
		System.out.println(s1.regdno);

		Student s2 = new Student();
		s2.getdata(18,20);
		System.out.println(s2.age);
		System.out.println(s2.regdno);
	}
}