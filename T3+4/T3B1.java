import java.io.*;
class Demo1
{
	public static void main (String[] args) {
		PhanSo p1=new PhanSo(),p2=new PhanSo(20,30),p3=new PhanSo();
		p1.xuat();
		p2.rutgon();
		p2.xuat();
		p3.nhap();
		p3.rutgon();
		p3.xuat();
		PhanSo cong=new PhanSo(p2.cong(p3));
		System.out.println ("Cong la:");
		cong.xuat();
		PhanSo tru=new PhanSo(p2.tru(p3));
		System.out.println ("Tru la:");
		tru.xuat();
		PhanSo nhan=new PhanSo(p2.nhan(p3));
		System.out.println ("Nhan la:");
		nhan.xuat();
		PhanSo chia=new PhanSo(p2.chia(p3));
		System.out.println ("Chia la:");
		chia.xuat();	
	}
}