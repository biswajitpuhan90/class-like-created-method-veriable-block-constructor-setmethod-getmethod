class Ratira 
{
	public String name="Titan rout";
	private int id=102;
	private double salary=56000.00;
	
	
	public void setId(int id){
		    this.id=id;
	}
	public int getId(){
		  return id;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
}
class amrita1
{

	public static void main(String[] args) 
	{
		Ratira W=new Ratira ();
		System.out.println(W.name);
		   W.setId(111);
		   W.setSalary(78000.00);
		System.out.println(W.getId());
		System.out.println(W.getSalary());
		
	}
}
