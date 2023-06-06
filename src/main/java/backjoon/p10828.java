package backjoon;

import java.io.*;
import java.util.Stack;

public class p10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //스택
        Stack<Integer> a = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                //push : 정수를 스택에 넣는 연산이다.
                case "push":
                    a.push(Integer.parseInt(input[1]));
                    break;
                //pop 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "pop":
                    if (a.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(a.pop() + "\n");
                    }
                    break;
                //size 스택에 들어있는 정수의 개수를 출력한다.
                case "size":
                    bw.write(a.size() + "\n");
                    break;
                //empty 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "empty":
                    if (a.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                //top 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "top":
                    if (a.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(a.peek() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

