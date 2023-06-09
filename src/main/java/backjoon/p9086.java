package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9086{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열 입력
        int T = Integer.parseInt(br.readLine());
        //문자열 반복
        //문자열의 첫글자와 마지막 글자만 가져오기 = charAt() 사용\
        //첫글자
        for (int i = 0; i < T; i++) {
                String s = br.readLine();
                System.out.print(" "+s.charAt(0));
                System.out.println(s.charAt(s.length()-1));
            }
        }
    }
