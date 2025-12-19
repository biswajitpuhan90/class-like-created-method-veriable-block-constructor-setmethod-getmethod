class kalu 
{
	
	public void m1() throws InterruptedException{
          gangstar();
	}
	public void  gangstar() throws InterruptedException{
		supariki1ler();
	}
	public void supariki1ler() throws InterruptedException{
		killer();
	}
	public void killer() throws InterruptedException{
		Thread.sleep(5000);
	}
	public static void main(String[] args) 
	{
		System.out.println("govt officer spot deadth");
		     kalu r=new kalu();
		try{
			r.m1();
		}catch(InterruptedException hi){
		}
		System.out.println("Hello World!");
	}
}
