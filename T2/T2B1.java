import java.io.*;
import java.util.Scanner;

class Demo1
{
	public static void main (String[] args) {
	Scanner x=new Scanner(System.in);
	SinhVien sv=new SinhVien();
	sv.input();
	sv.output();
	System.out.println ("Ho ten vua tao: "+sv.gethoten()+"\nThay ten khac: ");
	sv.sethoten(x.nextLine());
	System.out.println ("Ho ten sau khi thay: "+sv.gethoten());
}
}