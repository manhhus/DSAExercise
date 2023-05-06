package hw1_20001949_tranvanmanh;

public class Sphere {
    private int r, x, y, z;

	public Sphere(int r, int x, int y, int z) {
		super();
		this.r = r;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void dientichxq() {
		double s = 4 * Math.PI * this.getR() * this.getR(); 
		System.out.println("Diên tích xung quanh: " + (double) Math.round(s * 100) / 100);
	}
	
	public void thetich() {
		double v = 4 * Math.PI * Math.pow(this.getR(), 3) / 3;
		System.out.println("Thê tích: " + (double) Math.round(v * 100) / 100);
	}
	
	public double khoangCachTam(Sphere tam1) {
		
		double khoangcach = Math.sqrt(Math.pow(this.getX() - tam1.getX(),2)
						+ Math.pow(this.getY() - tam1.getY(),2)
						+ Math.pow(this.getZ() - tam1.getZ(),2));
		return khoangcach;
	}
	
	public void checkGiaoNhau(Sphere hinhtronkhac) {
		if (this.khoangCachTam(hinhtronkhac) + hinhtronkhac.getR() <= this.getR())  {
			System.out.println("Hai hinh tron bao nhau");
		}
		else if (this.khoangCachTam(hinhtronkhac) + this.getR() <= hinhtronkhac.getR())  {
			System.out.println("Hai hinh tron bao nhau");
		}
		else if (this.khoangCachTam(hinhtronkhac) <= this.getR() + hinhtronkhac.getR()) {
			System.out.println("Hai hinh tron giao nhau");
		}
		
	}
	@Override
	public String toString() {
		return "Sphere [r=" + r + "; (" + x + ", " +  y + ", "+  z + ")" + "]";
	}
	
 
}