import java.io.*;
import java.util.Scanner;
class Demo5
{
	public static void main (String[] args) {
		int a,b;
		PT1 p=new PT1();
		System.out.println("Nghiem: "+p.giai());
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap a:");
		p.seta(x.nextInt());
		System.out.println ("Nhap b:");
		p.setb(x.nextInt());
		System.out.println (p.tostring());
		if(p.giai()==0)
			System.out.println ("Pt vo so no");
		else if(p.giai()==1)
			System.out.println ("Pt vo no");
		else System.out.println(p.giai());
	}
}