interface good
{
	public abstract void m1();
	public abstract void m2();
	                void m3();
} 
class K22 implements good
{
	public void m1(){
		System.out.println("m1 method");
	}
	public void m2(){
		System.out.println("m2 method");
	}
	public void m3(){
		System.out.println("m3 method");
	}
	
	
	public static void main(String[] args) 
	{
		K22 j=new K22();
		    j.m1();
			j.m2();
			j.m3();
	}
}
