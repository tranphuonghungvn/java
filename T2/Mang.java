import java.io.*;
import java.util.Scanner;
public class Mang
{
	int n,a[],m;
	Scanner x=new Scanner(System.in);
	public void input()
	{
		System.out.println ("Nhap n:");
		n=x.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap a["+(i+1)+"]: ");
			a[i]=x.nextInt();
		}
	}
	public void output()
	{
		for(int i=0;i<n;i++)
			System.out.println ("a["+(i+1)+"]= "+a[i]);
	}
	public int max()
	{
		m=a[0];
		for(int i=1;i<n;i++)
			if(a[i]>m)
				m=a[i];
		return m;
	}
	public void sx()
	{
		int t;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
	}
	public float tb()
	{
		int s=0,j=0;
		for(int i=0;i<n;i++)
			if(a[i]%2!=0)
			{
				s+=a[i];
				j++;
			}
		return (float)s/j;
	}
}