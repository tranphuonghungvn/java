import java.io.*;
import java.util.Scanner;
public class Diem
{
	private int x,y;
	public Diem()
	{
		x=0;
		y=0;
	}
	public Diem(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public Diem(Diem z)
	{
		x=z.x;
		y=z.y;
	}
	public Diem tong(Diem d)
	{
		Diem kq=new Diem();
		kq.x=d.x+x;
		kq.y=d.y+y;
		return kq;
	}
	public void nhap()
	{
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap x:");
		this.x=x.nextInt();
		System.out.println ("Nhap y:");
		this.y=x.nextInt();
	}
	public void in()
	{
		System.out.println ("("+x+","+y+")");
	}
	public Diem dx(Diem z)
	{
		Diem kq=new Diem();
		kq.x=-(z.x);
		kq.y=-(z.y);
		return kq;
	}
}