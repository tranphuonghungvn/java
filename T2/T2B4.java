import java.io.*;

class Demo4
{
	public static void main (String[] args) {
		Mang a=new Mang();
		a.input();
		System.out.println ("Mang vua nhap la");
		a.output();
		System.out.println ("Max trong mang la:"+a.max());
		a.sx();
		System.out.println ("Mang sau khi sap xep la");
		a.output();
		System.out.println ("Trung binh le cua mang la:"+a.tb());
	}
}