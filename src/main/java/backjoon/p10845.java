package backjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //큐 선언
        Queue<Integer> q = new LinkedList<Integer>();
        int val1 = 0;

        int num1 = Integer.parseInt(br.readLine());
        for (int i = 0; i < num1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                //push 정수를 큐에 넣는 연산이다.
                case "push" :
                    int num2 = Integer.parseInt(st.nextToken());
                    q.add(num2);
                    val1 = num2;
                    break;
                //pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다
                case "pop" :
                    if (q.isEmpty()){
                        sb.append("-1\n");
                    }else {
                        sb.append(q.remove()+"\n");
                    }
                    break;
                //size: 큐에 들어있는 정수의 개수를 출력한다.
                case "size" :
                    sb.append(q.size() + "\n");
                    break;
                //empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
                case "empty" :
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                //front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "front" :
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peek() + "\n");
                    break;
                //back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
                case "back" :
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(val1 + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
