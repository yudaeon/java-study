package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class p11920 {
    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);

//        int n = sc.nextInt();
//        int k = sc.nextInt();
        int[]arr= {62,23,32,15};
        int a = arr.length;

        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < a-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
