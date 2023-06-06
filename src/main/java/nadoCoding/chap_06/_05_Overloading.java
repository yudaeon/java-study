package nadoCoding.chap_06;

public class _05_Overloading { //여러개의 메소드를 만드는것

    public static int getpower(int number) { //전달값
        int result = number * number;
        return result;
    }
    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); //int 형을 문자형으로 변환 Integer.parseInt 사용
        return  number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getpower(3)); //3*3 = 9출력
        System.out.println(getPower("4")); //4 * 4 =16
        System.out.println(getPower(3, 3)); //3*3*3=27
        //똑같은 이름의 메소드를 여러번 사용하는 걸 메소드 오버로딩이라고 한다.
        // 메소드오버로딩을 할 때에는 전달값의 타입이 다르거거나 ,갯수가 다를떄 사용가능

    }
}
