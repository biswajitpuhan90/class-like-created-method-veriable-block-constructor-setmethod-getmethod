class compiler 
{
	public static void k1(){
		System.out.println("Compiler:i am hero");
	}
}
class compiler extends jvm{
	public static void k1(){
		System.out.println("Jvm:i am hero");

}
	public static void main(String[] args) 
	{
		 compiler d=new  jvm();
		         d.k1();
		
	}
}
