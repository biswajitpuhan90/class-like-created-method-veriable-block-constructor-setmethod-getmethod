class Ex3 
{
	String name="biswa";
	int a=100;
}
class Ex4 extends Ex3
{
	int b=120;
}
class Ex5 extends Ex4 
{
int c=160;
	public static void main(String[] args) 
	{
	     Ex5 r=new Ex5(); 
		System.out.println(r.name);
		System.out.println(r.a);
		System.out.println(r.b);
		System.out.println(r.c);
	}
}
