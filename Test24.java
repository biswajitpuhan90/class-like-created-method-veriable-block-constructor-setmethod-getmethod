abstract class Test21
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class Test22 extends Test21{
	public void m1(){
		System.out.println("Wel Come To M1");
	}
}
abstract class Test23 extends Test22{
public void m2(){
	System.out.println("m2 method");
   }
}
public class Test24 extends Test23{
	public void m3(){
		System.out.println("m3 method");
}
public static void main(String[] args){
         Test24 w=new Test24();
		        w.m1();
				w.m2();
				w.m3();
}
}
