class worker12 
{
	public String name="biswa";
	private int id=121;
	
public void setId(int id){
	this.id=id;
}
public int getId(){
	return id;
   }
}
class teem
{
	public static void main(String[] args) 
	{
		worker12 R=new worker12 ();  
		System.out.println(R.name);
		       R.setId(100);
	   System.out.println(R.getId());
		
	}
}
