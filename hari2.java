class  hari2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try{
			System.out.println(10/0);
			String name="munu";
			System.out.println(name.charAt(10));
		}catch(ArithmeticException ke){
			System.out.println("catch-1");
		}catch(StringIndexOutOfBoundsException htgf){
			System.out.println("catch-2");
		}
			
	}
}
