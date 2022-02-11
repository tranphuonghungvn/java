import java.io.*;
import java.util.Scanner;
class HocVien extends Nguoi
{
	float d1,d2,d3;
	public HocVien()
	{
		super();
		d1=0;d2=0;d3=0;
	}
	public HocVien(String t,int n, float d1,float d2, float d3)
	{
		super(t,n);
		this.d1=d1;
		this.d2=d2;
		this.d3=d3;
	}
}