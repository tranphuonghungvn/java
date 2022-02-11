import java.io.*;
import java.util.Scanner;
class HangTP extends HangHoa
{
	private int ngaysx,ngaybh;
	public HangTP()
	{
		super();
		ngaybh=0;ngaysx=0;
	}
	public HangTP(String mh,String th,float dg,int nbh,int nsx)
	{
		super(mh,th,dg);
		this.ngaybh=nbh;
		this.ngaysx=nsx;
	}
	public void nhaptp()
	{
		Scanner x=new Scanner(System.in);
		super.nhap();
		System.out.println ("Nhap NgayBH:");
		ngaybh=x.nextInt();	
		System.out.println ("Nhap NgaySX:");
		ngaysx=x.nextInt();
	}
	public void xuattp()
	{
		Scanner x=new Scanner(System.in);
		super.xuat();
		System.out.print("Ngay BH: "+ngaybh+"\nNgay SX: "+ngaysx);
	}
}