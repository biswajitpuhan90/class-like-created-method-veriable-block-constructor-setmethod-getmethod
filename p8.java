class p 
{
	int a=107;
}
class p1 extends p
{
}
class p2 extends p
{
}

class p3 extends p2
{
}

class p4 extends p2
{
}

class p5 extends p3
{
}

class p6 extends p3
{
}
class p7 extends p6
{
}
class p8 extends p7
{
	public static void main(String[] args) 
	{
		        p8 g=new p8();
		System.out.println(g.a);
	}
}
