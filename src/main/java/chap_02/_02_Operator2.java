package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10; //num에 10 대입
        num = 10 + 2;
        System.out.println(num); //12

        num = num - 2;
        System.out.println(num); //10

        num = num * 2;
        System.out.println(num); //20

        num = num / 2;
        System.out.println(num); //10

        num = num % 2;
        System.out.println(num); //0

        //복합 대입 연산자
        num = 10;
        num += 2;
        System.out.println(num); //똑같은 변수를 사용할 떄 사용 //12

        num -= 2;
        System.out.println(num); //10

        num *= 2;
        System.out.println(num); //20

        num /= 2;
        System.out.println(num); //10

        num %= 2;
        System.out.println(num); //0
    }
}
