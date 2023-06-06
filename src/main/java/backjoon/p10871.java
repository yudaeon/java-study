package backjoon;

import java.util.Scanner;

public class p10871 { //1차원 배열
    // 정수 N개로 이루어진 수열 A와 X가 주어진다. 이때 A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오
    // 첫째줄에 N과 X가 주어진다.
    // 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 1보다 크거나 같고, 10000보다 작거나 같은 정수이다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[]arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] < X){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
