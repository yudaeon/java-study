package backjoon;

import java.util.Scanner;

public class p25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); //영수증에 적힌 총금액 260000
        int N = sc.nextInt(); // 구매한 물건의 종류의 수 4

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt(); //a = 각 물건의 가격
            int b = sc.nextInt(); //b = 각 물건의 개수

            X = X - (a * b);
        }
        if (X == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
