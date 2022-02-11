import java.io.*;
public class TG
{
	private int c1,c2,c3;
	public TG(int a,int b, int c)
	{
		c1=a;c2=b;c3=c;
	}
	public void kt()
	{
		if(c1==c2&&c2==c3)
			System.out.println ("Day la TG Deu");
		else if(c1==c2||c1==c3||c2==c3)
			System.out.println ("Day la TG Can");
		else System.out.println ("Day la TG Thuong");
	}
	public int chuvi()
	{
		return c1+c2+c3;
	}
	public float dientich()
	{
		return (float)Math.sqrt(chuvi()*(chuvi()-c1)*(chuvi()-c2)*(chuvi()-c3));
	}
}