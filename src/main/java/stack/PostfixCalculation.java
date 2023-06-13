package stack;



import com.sun.tools.javac.Main;

import javax.swing.text.Element;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Reverse Polish Notation-> Postfix Notation
public class PostfixCalculation {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //스택 선언
        Stack<Integer> digitStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i); //문자열 길이만큼 순회

            //1. 숫자라면, 스택에 push한다.
            //Character.isDigit(token) //token이 숫자가 표현된 글자인지 판단하는 메소드
            // token을 int로 변환 => token - '0' 하면 됨
            if (Character.isDigit(token)) {
                digitStack.push(token - '0');

                //2. 숫자가 아니라면, (연산자) 스택에서 두번 pop하고 계산한다.
            } else {
                int numLeft = digitStack.pop();
                int numRight = digitStack.pop();
                switch (token) {
                    case '+':
                        digitStack.push(numLeft + numRight);
                        break;
                    case '-':
                        digitStack.push(numLeft - numRight);
                        break;
                    case '*':
                        digitStack.push(numLeft * numRight);
                        break;
                    case '/':
                        digitStack.push(numLeft / numRight);
                        break;
                    default:
                        throw new IllegalArgumentException("invalid operator");
                }
            }
        }
        int answer = digitStack.pop();
        if (digitStack.empty())
            System.out.println(answer);

    }
     public static void main(String[] args) throws IOException {
        new PostfixCalculation().solution();
    }
}