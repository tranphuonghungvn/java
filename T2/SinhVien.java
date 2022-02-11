import java.io.*;
import java.util.Scanner;
public class SinhVien
{
	private String maso,hoten;
	private float dtb;
	Scanner x=new Scanner(System.in);
	public void setmaso(String ms){maso=ms;}
	public void sethoten(String ht){hoten=ht;}
	public void	setdtb(float d){dtb=d;}
	public String getmaso(){return maso;}
	public String gethoten(){return hoten;}
	public float getdtb(){return dtb;}
	public void input()
	{
		System.out.println ("Nhap ma so SV:");
		setmaso(x.nextLine());
		System.out.println ("Nhap ho ten SV:");
		sethoten(x.nextLine());
		System.out.println ("Nhap diem tb SV:");
		setdtb(x.nextFloat());
	}
	public void output()
	{
		System.out.print ("MSSV: "+maso+"\nHo ten: "+hoten+"\nDTB: "+dtb+"\nXep loai: ");
		rank();
	}
	public void rank()
	{
		if(dtb>=8)
			System.out.println ("Gioi");
		else if(dtb>=6.5)
			System.out.println ("Kha");
		else if(dtb>=5)
			System.out.println ("Trung Binh");
		else System.out.println ("Yeu");
	}
}
