package backjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class p10757 {
    public static void main(String[] args) {
        //큰 숫자 사용할 때에는 BigInteger사용하기

        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
    }
}
