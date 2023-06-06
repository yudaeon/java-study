package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a; i++) {
            String str = br.readLine();
            int val1 = str.indexOf(" ");
            int result = Integer.parseInt(str.substring(0, val1))+Integer.parseInt(str.substring(val1 + 1));
            sb.append(result+"\n");
        }
        br.close();
        System.out.println(sb);
    }
}
