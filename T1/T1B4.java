import java.io.*;
import java.lang.*;
import java.util.Scanner;

class vd4
{
	public static void main (String[] args) 
	{
		Scanner x=new Scanner(System.in);
		int d,c,k,s=0;
		System.out.print("Nhap dong: ");
		d=x.nextInt();
		System.out.print("Nhap cot: ");
		c=x.nextInt();
		int a[][]=new int[d][c];
		for(int i=0;i<d;i++)
			for(int j=0;j<c;j++)
//				a[i][j]=(int)(Math.random()*100);
				a[i][j]=i+j;
		System.out.println ("Mang da nhap:");
		for(int i=0;i<d;i++)
		{
			for(int j=0;j<c;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println ("");
		}
		System.out.print("Nhap dong can tinh tong: ");
		k=x.nextInt();
		for(int j=0;j<c;j++)
			s+=a[k][j];
		System.out.println ("Tong cac phan tu tren dong "+k+" la: "+s);
	}
}