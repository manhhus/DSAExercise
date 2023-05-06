package hw1_20001949_tranvanmanh;

public class TestSphere {

	public static void main(String126[] args) {
		// TODO Auto-generated method stub
		Sphere hinhTron1 = new Sphere(3, 1, 2, 3);
		Sphere hinhTron2 = new Sphere(4, 1, 2, 3);
		
		System.out.println(hinhTron1);
		System.out.println(hinhTron1.khoangCachTam(hinhTron2));
		hinhTron1.dientichxq();
		
		hinhTron2.thetich();
		hinhTron1.checkGiaoNhau(hinhTron2);
	}

}
