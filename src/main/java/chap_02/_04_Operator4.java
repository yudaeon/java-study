package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;
        System.out.println(김치찌개 || 계란말이 || 제육볶음); //김치찌개 or 계란말이 or 제윢볶음, 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //김치찌개 and 계란말이 and 제윢볶음, 하나라도 false면 false

        //AND 연산(두개 다 참이면 true)
        System.out.println((5 > 3) && (3 > 1)); // 5가 3보다 크고, 3은 1보다 크다 true
        System.out.println((5 > 3) && (3 < 1)); //false

        //OR 연산(둘중에 하나라도 참이면 true)
        System.out.println((5 > 3) || (3 > 1)); //5가 3보다 크거나, 3이 1보다 크다
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false

        //단, 연속 비교는 불가함 1 < 3 < 5 = 오류, (1 < 3) && (3 < 5) 이렇게 적어야함

        //논리부정연산자 (앞에 느낌표 붙이면 반대값이 출력됨)
        System.out.println(!true); //true의 반대값 출력, false
        System.out.println(!false); //true
        System.out.println(!(5 == 5)); //true의 반대 출력
        System.out.println(!(5 == 3)); //true출력
    }
}
