package backjoon;

import java.util.Scanner;

public class p2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a-i; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}