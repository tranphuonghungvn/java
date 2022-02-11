import java.io.*;

public class HCN
{
	public int dai,rong;
	public HCN(int x)
	{
		dai=rong=x;
	}
	public HCN(int a,int b)
	{
		dai=a;
		rong=b;
	}
	public int chuvi()
	{
		return (dai+rong)*2;
	}
	public int dientich()
	{
		return dai*rong;
	}
}