package hw1_20001949_tranvanmanh;

public class Generic<T> {
	private T array;

	public Generic() {
		
	}

	public Generic(T array) {
		this.array = array;
	}

	public T getArray() {
		return array;
	}

	public void setArray(T array) {
		this.array = array;
	}

	public boolean perfectNumber() {
		int temp;
		int sum = 0;
		if (array instanceof Integer) {
			temp = (int) array;
		} else {
             temp = Math.round((float)array);
		}
		for (int i = 1; i <= temp/2; i++) {
			if (temp % i == 0) {
				sum += i;
			}
		}
		if (sum == temp ) {
			return true;
		} else {
			return false;
		}
	}
	
}