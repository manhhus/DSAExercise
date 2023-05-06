package hw1_20001949_tranvanmanh;

import java.util.Arrays;

public class NumbersArray<N extends Number> { //bai2

    private final Object[] objArr;
    public final int length;

    public NumbersArray(int length) {
        objArr = new Object[length];
        this.length = length;
    }

    N get(int i) {
        @SuppressWarnings("unchecked") final N n = (N) objArr[i];
        return n;
    }

    void set(int i, N n) {
        objArr[i] = n;
    }

    public String toString() {

        return Arrays.toString(objArr);
    }
}