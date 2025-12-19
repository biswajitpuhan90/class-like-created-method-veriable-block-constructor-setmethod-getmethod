class compiler 
{
	public void k1(){
		System.out.println("Compiler:i am hero");
	}
}
class jvm extends compiler  
{
	public void k1(){
		System.out.println("Jvm:i am hero");

}
	public static void main(String[] args) 
	{
		 compiler d=new  jvm();
		         d.k1();
		
	}
}

