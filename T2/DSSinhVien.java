import java.io.*;
import java.util.Scanner;
public class DSSinhVien
{
	private int n;
	private SinhVien sv[];
	Scanner x=new Scanner(System.in);
	public void nhapds()
	{
		System.out.println ("Nhap so SV:");
		n=x.nextInt();
		sv=new SinhVien[n];
		for(int i=0;i<n;i++)
		{
			sv[i]=new SinhVien();
			System.out.println ("Nhap SV thu "+(i+1)+":");
			sv[i].input();
		}
	}
	public void xuatds()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+(i+1)+"\t"+sv[i].getmaso()+"\t"+sv[i].gethoten()+"\t"+sv[i].getdtb()+"\t");
			sv[i].rank();
		}
	}
	public void sxgiamtb()
	{
		SinhVien t=new SinhVien();
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			if(sv[i].getdtb()<sv[i+1].getdtb())
			{
				t=sv[i];
				sv[i]=sv[i+1];
				sv[i+1]=t;
			}	
	}
}