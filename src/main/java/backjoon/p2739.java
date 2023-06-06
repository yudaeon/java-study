package backjoon;

import java.util.Scanner;

public class p2739 { //반복문) 구구단 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " +(a*i));
        }
    }
}
