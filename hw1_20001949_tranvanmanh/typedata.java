package hw1_20001949_tranvanmanh;

import java.util.*;
public class typedata {

	public static void main(String126[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a=1: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập b=2.3: ");
		Double b = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập c=true: ");
		boolean c = Boolean.parseBoolean(sc.nextLine());
		System.out.println("Nhập d=3f: ");
		float d = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập e=2: ");
		long e = Long.parseLong(sc.nextLine());
		System.out.println("Nhập f=2: ");
		byte f = Byte.parseByte(sc.nextLine());
		System.out.println("Nhập h=23: ");
		short h = Short.parseShort(sc.nextLine());
				//vẫn còn
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		sc.close();
	}

}
