package nadoCoding.chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자(5가 3보다 큰지를 비교하는 것)
        System.out.println(5  > 3); //5는 3보다 크다, 맞으면 true
        System.out.println(5 >= 3); //5가 3보다 크거나 같은지 true
        System.out.println(5 >= 5); //5는 5보다 크거나 같다 true
        System.out.println(5 >= 7); //5가 7보다 크거나 같다 false
        System.out.println(5 < 3); //false
        System.out.println(5 <= 3); //false
        System.out.println(5 == 5); //두 값이 똑같은지? true
        System.out.println(5 == 3); //false
        System.out.println(5 != 5); //5는 5와 같지 않은지 != 같지 않다 false
        System.out.println(5 != 3); //true\
    }
}
