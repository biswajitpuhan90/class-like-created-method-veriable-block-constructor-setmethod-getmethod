class Worker12 
{
	public void m1(){
		System.out.println("Wel Come M1 method");
	}
}
class s1 extends Worker12
{
	public void m1(){
		System.out.println("Wel Come To Sub Class");
		
}
	public static void main(String[] args) 
	{       s1 t=new s1 ();
		t.m1();
	}
}
