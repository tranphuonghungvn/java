import java.io.*;
import java.util.Scanner;
public class PhanSo
{
	private int tu,mau;
	private Scanner x=new Scanner(System.in);
	public PhanSo()
	{
		tu=0;
		mau=1;
	}
	public PhanSo(int tu,int mau)
	{
		this.tu=tu;
		this.mau=mau;
	}
	public PhanSo(PhanSo ps)
	{
		tu=ps.tu;
		mau=ps.mau;
	}
	public void xuat()
	{
		System.out.println (tu+"/"+mau);
	}
	public void nhap()
	{
		System.out.println ("Nhap tu so:");
		tu=x.nextInt();
		System.out.println ("Nhap mau so:");
		mau=x.nextInt();
	}
	public int ucln(int tu,int mau)
	{
		while(tu!=0&&mau!=0)
			if(tu>mau)
				tu-=mau;
			else
				mau-=tu;
		if(tu==0)
			return mau;
		else
			return tu;
	}
	public void rutgon()
	{
		int tam=ucln(Math.abs(tu),Math.abs(mau));
		tu=tu/tam;
		mau=mau/tam;
	}
	public PhanSo cong(PhanSo ps)
	{
		PhanSo kq=new PhanSo();
		kq.mau=ps.mau*mau;
		kq.tu=ps.tu*mau+ps.mau*tu;
		kq.rutgon();
		return kq;
	}
	public PhanSo tru(PhanSo ps)
	{
		PhanSo kq=new PhanSo();
		kq.mau=ps.mau*mau;
		kq.tu=ps.tu*mau-ps.mau*tu;
		kq.rutgon();
		return kq;
	}
	public PhanSo nhan(PhanSo ps)
	{
		PhanSo kq=new PhanSo();
		kq.tu=ps.tu*tu;
		kq.mau=ps.mau*mau;
		kq.rutgon();
		return kq;
	}
	public PhanSo chia(PhanSo ps)
	{
		PhanSo kq=new PhanSo();
		kq.tu=mau*ps.tu;
		kq.mau=tu*ps.mau;
		kq.rutgon();
		return kq;
	}
}