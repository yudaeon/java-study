package backjoon;

import java.util.Scanner;

public class p27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]a = sc.next().split("");
        int b = sc.nextInt();

        System.out.println(a[b-1]);
    }
}
