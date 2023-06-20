package stack;

import javax.swing.plaf.PanelUI;

public class MyStack {
    //스택에 실제 데이터가 저장되는 곳
    private final int[]arr = new int[16];
    //현재 스택의 최고점을 파악하기 위한 top
    private int top = -1;

    public  MyStack(){}
        //push : 데이터를 스택의 제일 위에 넣는 메소드
        public void push(int data){
        //0. arr가 가득 찼는지를 판단한다.
            if (arr.length -1 == top) {
                throw new RuntimeException("Stack is full");
                //return; 해도됨
            }
//        //1. top을 하나 증가시킨다.
//            top++;
//
//        //2. arr[top]에 data를 할당한다.
//            arr[top] = data;
//            //arr[++top] = data;로 쓸수 있다.
//        //push 끝!
            arr[++top] = data;

        }
        //pop : 데이터를 스택의 제일 위에서 회수하는 메소드
     public int pop(){
        //0. 스택의 arr가 비어있는지 판단한다.(top)기준
         if (top == -1){
             throw new RuntimeException("Stack is empty");
         }
        //1. arr[top]의 값을 임시저장한다.
         int temp = arr[top];
        //2. top의 값을 하나 감소한다.
         top--;
        //3. 임시 저장했던 값을 반환한다.
         return temp;
         //return arr[top--];로 사용할 수 있다.
        // 끝!
     }
     //peek: 스택의 제일 위에 어떤 기능이 있는지 확인하는 기능
    //제거 하지 않는다. : 탑의 기능을 변환시키지 않는다.
    public int peek(){
        // 0. 스택이 비어있지 않은지 확인
        if (top == -1){
            throw new RuntimeException("stack is empty");
        }
        return arr[top];
    }
    public boolean empty(){
        return top == -1;
    }

    public static void main(String[] args) {
        //스택에 3개의 데이터를 넣었다가 빼보자
        MyStack intStack = new MyStack();
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.empty());
        System.out.println(intStack.peek());
    }
}
