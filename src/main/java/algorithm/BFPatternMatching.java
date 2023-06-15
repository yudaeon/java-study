package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFPatternMatching {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String pattern = br.readLine();

        int tarIdx = 0;
        int patIdx = 0;

        while (tarIdx < target.length() && patIdx < pattern.length()){
            if (target.charAt(tarIdx) != pattern.charAt(patIdx)){
                tarIdx -= patIdx;
                patIdx =  -1;
            }

            tarIdx += 1;
            patIdx += 1;
        }
        if (patIdx == pattern.length()){
            System.out.println(tarIdx - patIdx);
        }
        else {
            System.out.println("404 Not Found");
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
