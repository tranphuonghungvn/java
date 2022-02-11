import java.io.*;
class Demo2
{
	public static void main (String[] args) {
		Diem a=new Diem(),b=new Diem(2,3);
		a.in();
		a.nhap();
		a.in();
		b.in();
		Diem c=new Diem(b.tong(a));
		c.in();
		c=c.dx(c);
		c.in();
	}
}