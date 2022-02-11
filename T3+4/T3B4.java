import java.io.*;
import java.util.Scanner;
class Demo4
{
	public static void main (String[] args) {
		int a,b,c;
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap a:");
		a=x.nextInt();
		System.out.println ("Nhap b:");
		b=x.nextInt();
		System.out.println ("Nhap c:");
		c=x.nextInt();
		TG t=new TG(a,b,c);
		t.kt();
		System.out.print("Chu vi: "+t.chuvi());
		System.out.print("\nDien tich: "+t.dientich());
	}
}