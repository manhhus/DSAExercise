package hw3_20001949_tranvanmanh_fraction;

//Tạo đối tượng Fraction
public class Fraction {
	private float numerator; //Tử số
	private float denominator; //Mẫu số
	
	
	public Fraction (float numerator, float denominator) {
		//Hàm khởi tạo
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction add(Fraction c) {
		//Hoàn thành hàm cộng phân số hiện tại với phân số c
		float ts = this.getNumerator() * c.getDenominator() + c.getNumerator() * this.getDenominator();
      float ms = this.getDenominator() * c.getDenominator();
      Fraction phanSoTong = new Fraction(ts, ms);
      return normalize(phanSoTong);       
	}
	
	public Fraction minus(Fraction c) {
	//Hoàn thành hàm trừ phân số hiện tại cho phân số c
		float ts = this.getNumerator() * c.getDenominator() - c.getNumerator() * this.getDenominator();
      float ms = this.getDenominator() * c.getDenominator();
      Fraction phanSoHieu = new Fraction(ts, ms);
      return normalize(phanSoHieu); 
	}
	
	public Fraction multi(Fraction c) {
	//Hoàn thành hàm nhân phân số hiện tại với phân số c		
      float ts = this.getNumerator() * c.getNumerator();
      float ms = this.getDenominator() * c.getDenominator();
      Fraction phanSoTich = new Fraction(ts, ms);
      return normalize(phanSoTich);
	}
	
	public Fraction divi(Fraction c) {
	//Hoàn thành hàm chia phân số hiện tại cho phân số c
		float ts = this.getNumerator() * c.getDenominator();
      float ms = this.getDenominator() * c.getNumerator();
      Fraction phanSoThuong = new Fraction(ts, ms);
      return normalize(phanSoThuong);
	}	
	
	public Fraction normalize(Fraction c) {
	//Hoàn thành hàm tối giản phân số
		float num1 = Math.round(Math.abs(c.numerator))*100;
		float num2 = Math.round(Math.abs(c.denominator))*100;
		while (num1 != num2) {
          if(num1 > num2)
              num1 = num1 - num2;
          else
              num2 = num2 - num1;
      }		
		c.numerator = Math.round(c.numerator)*100 / num2;
		c.denominator = Math.round(c.denominator)*100 / num2;
		
      return c;
	}
	
	public float getNumerator() {
		return numerator;
	}
	
	public float getDenominator() {
		return denominator;
	}
	
	@Override
	public String toString() {
	//Hoàn thành hàm in ra phân số có dạng a/b
		if (denominator < 0 || (denominator < 0 && numerator <0)) {
			denominator = - denominator;
			numerator = - numerator;
		}
		return numerator + "/" + denominator;
	}
	
}
