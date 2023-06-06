package backjoon;

import java.util.Scanner;

public class p2438 {
    public static void main(String[] args) {//별찍기
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 0; i < star; i++) {
            for (int j = 0; j < (star-1)-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
