package nadoCoding.chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문
        //예제1) 별 (*)로 사각형 만들기
        /*
        *****
        *****
        *****
        *****
        *****
         */ //이중반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            System.out.print("*");
            }
            System.out.println();
            }
        System.out.println("--------------------");
        //별 왼쪽삼각형 만들기
        /*

        *
        **
        ***
        ****
        *****
        1씩 횟수 늘어나는 삼각형 만들기 */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //별 오른쪽 삼각형 만들기
        /*
        ssss*
        sss**
        ss***
        s****
        *****  */

        for (int i = 0; i < 5; i++){
           for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


