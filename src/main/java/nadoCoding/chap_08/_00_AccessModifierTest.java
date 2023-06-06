package nadoCoding.chap_08;

import nadoCoding.chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        //   b1.resulution = "FHD"; //default여서 다른 패키지이므로 사용할 수 없음
       // b1.price = 200000; //private여서 다른 패키지 사용 불가
      //  b1.color ="블랙"; //protected 같은 클래스거나, 다른클래스인경우 자식 클래스일떄만 사용가능

    }
}
