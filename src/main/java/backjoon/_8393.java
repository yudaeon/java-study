package backjoon;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        int num = sc.nextInt();
        int sum=0;

        //1부터 n까지 합 구하기
        for (int i = 1; i <=num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
