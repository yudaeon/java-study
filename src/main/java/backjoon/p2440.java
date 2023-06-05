package backjoon;

import java.util.Scanner;

public class p2440 {
    //역피라미드 만들기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = i+1; j <=star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
