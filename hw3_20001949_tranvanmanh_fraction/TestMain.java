package hw3_20001949_tranvanmanh_fraction;

import java.util.Scanner;

public class TestMain {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhập số phân số : ");
    	int n = sc.nextInt();
    	
    	Fraction fraction[] = new Fraction[n];
    	for (int i = 0; i < n; i++) {
    		System.out.print("Tử số " + (i+1) + " = ");
    		float a = sc.nextFloat();
    		System.out.print("Mẫu số " + (i+1) + " = ");
    		float b = sc.nextFloat();
    		fraction[i] = new Fraction(a,b);
    	}
      
        Fraction tong = fraction[0];
    	Fraction maxFaction = fraction[0];
    	
    	
        System.out.print("In ra phân số thứ: ");
    	int k = sc.nextInt();
        System.out.println("Phân số thứ " + k + " là " + fraction[k-1]);
        for(int i = 1; i < n; i++) {
        	tong = tong.add(fraction[i]);
        }
        System.out.println("Tổng các phân số: " + tong);
        
        // phần sao, tìm phân số lớn nhất
        for(int i = 1; i < n; i++) {
        	if (fraction[i].minus(maxFaction).getNumerator()/fraction[i].minus(maxFaction).getDenominator() > 0) {
        		maxFaction = fraction[i];
        	}
        }
        System.out.println("Phân số lớn nhất: " + maxFaction);
     
        sc.close();
    }
     
}