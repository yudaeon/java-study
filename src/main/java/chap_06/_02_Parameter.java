package chap_06;

public class _02_Parameter {
    //전달값이 있는 메소드
    public static void power(int number){ //parameter = 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }
    //메소드 2번째 
    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
        }

    public static void main(String[] args) {
        //전달값, parameter
        // 2 -> 2*2 =4 출력
        // 3-> 3*3 = 9출력

        //argument = 인수
        power(2 ); // 2*2=4출력
        power(3);

        powerByExp(2,3);
        powerByExp(3,3);
        powerByExp(10,0);
    }
}
