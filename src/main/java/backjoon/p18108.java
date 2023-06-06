package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p18108 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
////        int year = sc.nextInt();
////        System.out.println(year-543);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int year = Integer.parseInt(s);

        System.out.println(year-543);

    }
}
