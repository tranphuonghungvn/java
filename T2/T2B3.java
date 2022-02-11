import java.io.*;
class Demo3
{
	public static void main (String[] args) {
		DSSinhVien dssv=new DSSinhVien();
		dssv.nhapds();
		System.out.println ("Danh sach vua nhap:\nSTT\tMSSV\tHoTen\tDiemTB\tXL");
		dssv.xuatds();
		dssv.sxgiamtb();
		System.out.println ("Danh sach vua sap xep:\nSTT\tMSSV\tHoTen\tDiemTB\tXL");
		dssv.xuatds();
}
}