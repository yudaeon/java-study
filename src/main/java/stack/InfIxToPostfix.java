package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfIxToPostfix {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //결과를 담는 스택(
        StringBuilder answerBuilder = new StringBuilder();
        //연산자 담는 스택 (연산자=operator)
        Stack<Character> operStack = new Stack<>();

        //문자 단위로 순회
        for (int i = 0; i < input.length(); i++) {
                char token = input.charAt(i);

                //연산자(+,-,*,/,'('일때
                if (false){
                    //조건 :스택이 비어있다면 push
                    //스택이 비지 않았다면 pop
                    //스택의 제일 위의 연산자가 나보다 우선순위가 낮은 연산자가 올때까지 pop*(while)
                    //순회 중 스택이 다 빌경우 반복 중단(if break)
                    //while종료 후 스택에  push

                }
                else if(token == ')') {
                    //스택에서 여는 괄호가 나올때까지 pop
                }
                else answerBuilder.append(token);
        }
    }
}
