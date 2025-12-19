class Ex1 
{
	int id=120;
	String name="biswajit";
}
class Ex2 extends Ex1
{
double salary;
	public static void main(String[] args) 
	{
		Ex2 k=new Ex2();
		System.out.println(k.id);
		System.out.println(k.name);
		System.out.println(k.salary);
	}
}
