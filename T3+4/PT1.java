import java.io.*;
class PT1
{
	private int a,b;
	public PT1()
	{
		a=0;b=0;
	}
	public PT1(int a,int b)
	{
		this.a=a;this.b=b;
	}
	public void seta(int a)
	{
		this.a=a;
	}
	public void setb(int b)
	{
		this.b=b;
	}
	public int geta()
	{
		return a;
	}
	public int getb()
	{
		return b;
	}
	public float giai()
	{
		if(a==0)
			if(b==0)return 0;
			else return 1;
		else return -b/a;
	}
	public String tostring()
	{
		return a+"x +"+b+" = 0\nNghiem: ";
	}
}