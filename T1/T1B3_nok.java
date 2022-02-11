import java.io.*;
import java.util.*;

class vd3
{
	public static void main (String[] args) 
	{
		int n;
		Scanner x=new Scanner(System.in);
		System.out.print("Nhap n: ");
		n=x.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("a["+i+"]: ");
			a[i]=x.nextInt();
		}
		System.out.println ("mang da nhap la:");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]= "+a[i]);
	}
}