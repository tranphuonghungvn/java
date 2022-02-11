import java.io.*;
import java.util.Scanner;
class HangHoa
{
	protected String mh,th;
	protected float gia;
	public HangHoa()
	{
		mh="";th="";gia=0;
	}
	public HangHoa(String mh, String th, float gia)
	{
		this.mh=mh;this.th=th;this.gia=gia;
	}
	public void nhap()
	{
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap Mahang:");
		mh=x.nextLine();
		System.out.println ("Nhap Tenhang:");
		th=x.nextLine();
		System.out.println ("Nhap Gia:");
		gia=x.nextFloat();
	}
	public void xuat()
	{
		System.out.println ("Mahang: "+mh+"\nTenhang: "+th+"\nGia: "+gia);
	}
}