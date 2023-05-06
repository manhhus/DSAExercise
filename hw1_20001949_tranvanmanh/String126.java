package hw1_20001949_tranvanmanh;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class String126 {      //diffname: reverseLine
 
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.printf("Số dòng: ");       
//		String[] input = new String[sc.nextInt()]; //mảng các dòng
//		sc.nextLine();
//
//		for (int i = 0; i < input.length; i++) {    //lưu vào mảng
//			input[i] = sc.nextLine();
//		}
//
//		System.out.printf("Đảo ngược:\n");
//		for (int i = input.length - 1; i >= 0 ; i--) {
//			System.out.println(input[i]);
//		}
//		sc.close();
		
		
//	}
	
	public static void main(String[] args) {
        binaryFactory(3,"",0);
    }
    public static void binaryFactory(int n, String binary, int index){
        if(index == n){
            System.out.println(binary);
            return;
        }

        for(int i = 0; i <= 1; i ++){
            binaryFactory(n, binary+i, index+1);
        }
    }
}

