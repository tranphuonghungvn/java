import java.io.*;
import java.util.Scanner;
class DMHangHoa extends HangHoa
{
	private int tgbh,da,cs;
	public DMHangHoa()
	{
		super();
		tgbh=0;da=0;cs=0;
	}
	public DMHangHoa(String mh, String th, float gia, int tgbh, int da, int cs)
	{
		super(mh,th,gia);
		this.tgbh=tgbh;
		this.da=da;
		this.cs=cs;
	}
	public void nhapdm()
	{
		Scanner x=new Scanner(System.in);
		super.nhap();
		System.out.println ("Nhap TGBH:");
		tgbh=x.nextInt();
		System.out.println ("Nhap Dienap:");
		da=x.nextInt();
		System.out.println ("Nhap Congsuat:");
		cs=x.nextInt();
	}
	public void xuatdm()
	{
		super.xuat();
		System.out.println ("TGBH: "+tgbh+"\nDienap: "+da+"\nCongsuat: "+cs);
	}
}