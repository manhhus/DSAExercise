package hw1_20001949_tranvanmanh;

public class TestPhanSo {
    
    public static void main(String[] args) {
    	
    	PhanSo phanSo[] = new PhanSo[4];
        phanSo[0] = new PhanSo(1,1);    
        System.out.println(phanSo[0]);
        
        phanSo[1] = new PhanSo(1,1);
        phanSo[2] = new PhanSo(1,1);
        phanSo[3] = new PhanSo(1,1);
        
        PhanSo tong = phanSo[0];
    	PhanSo hieu = phanSo[0];
    	PhanSo tich = phanSo[0];
    	PhanSo thuong = phanSo[0];
    	
        for(int i = 1; i < 4; i++) {
        	tong = tong.congPhanSo(phanSo[i]);
        }
        System.out.println("Tổng các phân số: " + tong);
        
        for(int i = 1; i < 4; i++) {
        	hieu = hieu.truPhanSo(phanSo[i]);
        }
        System.out.println("Hiệu các phân số: " + hieu);
        
        for(int i = 1; i < 4; i++) {
        	tich = tich.nhanPhanSo(phanSo[i]);
        }
        System.out.println("Tích các phân số: " + tich);
        
        for(int i = 1; i < 4; i++) {
        	thuong = thuong.chiaPhanSo(phanSo[i]);
        }
        System.out.println("Thương các phân số: " + thuong);
    }
     
}