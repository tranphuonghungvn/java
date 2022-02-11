import java.io.*;
import java.util.Scanner;

class Nguoi
{
	public String ten;
	public int ns;
	public Nguoi()
	{
		ten="";
		ns=0;
	}
	public Nguoi(String t, int n)
	{
		ten=t;
		ns=n;
	}
	public void nhap()
	{
		Scanner x= new Scanner(System.in);
		System.out.println ("Nhap ten:");
		ten=x.nextLine();
		System.out.println ("Nhap nam sinh:");
		ns=x.nextInt();
	}
	public void xuat()
	{
		System.out.println ("Ten: "+ten+"\nNam Sinh: "+ns);
	}
}