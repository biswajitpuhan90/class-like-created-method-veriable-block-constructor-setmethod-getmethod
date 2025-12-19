class Ex6 
{
	int a=170;
}
	class Ex7
	{
		int b=125;
	}
	class Ex8 extends Ex6,Ex7
	{
	int c;
	public static void main(String[] args) 
	{
	        	Ex8 k=new Ex8();
		System.out.println(k.a);
		System.out.println(k.b);
		System.out.println(k.c);
	}
}
