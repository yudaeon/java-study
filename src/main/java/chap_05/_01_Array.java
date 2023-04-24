package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나"); //아메리카노 하나
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler+ "하나");
        System.out.println(coffeeMonica+ "하나");
        System.out.println("주세요");

        //배열 선언 첫번째 방법 
       // String[] coffees = new String[4]; //크기 4에 해당하는 똑같은 배열을 만듦
        
        //배열 선언 두번째 방법
      //  String coffees[] = new String[4]; 위에꺼랑 대괄호의 위치만 다름
//        coffees[0] = "아메리카노"; //인덱스 값은 항상 0부터 시작한다.
//        coffees[1] = "카페모카"; //인덱스 값은 항상 0부터 시작한다.
//        coffees[2] = "라떼"; //인덱스 값은 항상 0부터 시작한다.
//        coffees[3] = "카푸치노"; //인덱스 값은 항상 0부터 시작한다.
      
        //배열 선언 세번째 방법 
       // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"} ;

        //배열 선언 네번쨰방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"} ;

        //커피 주문
        System.out.println(coffees[0] + " 하나"); //아메리카노 하나 출력
        System.out.println(coffees[1] + " 하나"); //아메리카노 하나 출력
        //챈슬러 라떼를 에스프레소로 변경할 경우
        coffees[2] = "에스프레소"; // 커피즈 2번째 배열에 에스프레소로 변경
        System.out.println(coffees[2] + " 하나"); //아메리카노 하나 출력
        System.out.println(coffees[3] + " 하나"); //아메리카노 하나 출력
        System.out.println("주세요");

        // 다른 자료형 가능
        // int 타입
    //    int[] i = new int[];
//        i[0] = 1;
//        i[1] = 1;
//        i[2] = 1;
        //double 타입
        double[] d = new double[] {10.0, 11.2, 13.5};
        // boolean 타입
        boolean[] b = {true, true, true};
    }
}
