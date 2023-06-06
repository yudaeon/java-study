package nadoCoding.chap_06;

public class _04_ParameaterAndReturn {

    public static int getpower(int number) { //전달값
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) { //반환값
        //전달값과 반환값이 함께있는 메소드 만들기
       int retVal =  getpower(2); //2*2=4 호출
        System.out.println(retVal);

        retVal = getpower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); //3*3*3 = 27s

        System.out.println(getPowerByExp(2,4));
    }
}
