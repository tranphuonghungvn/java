import java.io.*;
import java.util.Scanner;
class Demo2
{
	public static void main (String[] args) {
		int n;
		Scanner x=new Scanner(System.in);
		System.out.println ("Nhap so luong sv: ");
		n=x.nextInt();
		SinhVien sv[]=new SinhVien[x.nextInt()];
		for(int i=0;i<n;i++)
		{
			sv[i]=new SinhVien();
			sv[i].input();
		}
		System.out.println ("Danh sach vua tao:\nMSSV\tHoTen\tDiemTB\tXL");
		for(int i=0;i<n;i++)
		{
			System.out.print ("\t"+sv[i].getmaso()+"\t"+sv[i].gethoten()+"\t"+sv[i].getdtb()+"\t");
			sv[i].rank();
		}	
	}
}