package nadoCoding.chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4); //정수형 소수점들은 제외하고 출력됨

        System.out.println(4 % 2); //나머지 연산->4를 2로 나눈 나머지 출력
        System.out.println(5 % 2);

        // 우선순위 연산, 먼저 할 연산이 있을 경우 괄호 사용()
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c); //나머지 없으므로

        // 증감연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); //11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10 문장을 실행할 때에는 10이기 때문에 10출력
        System.out.println(val); //11 그뒤에 11 출력

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        //예제) 은행 대기 번호표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); //0
        System.out.println("대기 인원 : " + waiting++); //1
        System.out.println("대기 인원 : " + waiting++); //2
        System.out.println("총 대기 인원 : " + waiting); //총 대기인원 3
    }
}