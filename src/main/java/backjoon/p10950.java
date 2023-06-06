package backjoon;

import java.util.Scanner;

public class p10950 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); //스캐너

            int T = sc.nextInt();  //테스트 케이스의 개수
            int arr[] = new int[T];

            for (int i = 0; i < T; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[i] = a + b;
            }
            sc.close();

            for (int k : arr) {
                System.out.println(k);
            }
        }
    }
