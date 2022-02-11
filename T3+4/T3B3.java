import java.io.*;
import java.util.Scanner;

class Demo3
{
	public static void main (String[] args) {
		int d,r;
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap chieu dai HCN1:");
		d=x.nextInt();
		System.out.println ("Nhap chieu rong HCN1:");
		r=x.nextInt();
		HCN a=new HCN(d,r);
		System.out.println ("Nhap dai = rong HCN2:");
		d=x.nextInt();
		HCN b=new HCN(d);
		int cv1=a.chuvi();
		int dt1=a.dientich();
		System.out.println ("HCN1\nDien tich: "+dt1+"\nChu vi: "+cv1);
		System.out.print("HCN2\nDien tich: "+b.dientich()+"\nChu vi: "+b.chuvi());
		
}
}