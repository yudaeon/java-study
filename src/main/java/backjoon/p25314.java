package backjoon;

import java.util.Scanner;

public class p25314 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int div = n/4; //4의 배수
        for (int i = 0; i < div; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
