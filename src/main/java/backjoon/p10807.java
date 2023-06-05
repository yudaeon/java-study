package backjoon;

import java.util.Scanner;

public class p10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        int cnt = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for (int j = 0; j <a; j++) {
            if (arr[j] == v)
                cnt++;
        }
        System.out.println(cnt);
    }
}