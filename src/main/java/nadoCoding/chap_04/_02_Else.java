package nadoCoding.chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 : If Else 문
        int hour = 15;
            if (hour < 14) { // 오후 2시 이전이면 커피 주문
            System.out.println("아이스 아메리카노 +1");
        } else { // 그외의 경우이면 디카페인 주문
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        //오후2시 이후이거나, 모닝커피를 마신경우?
        hour = 10;
        boolean morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) { //오후2시이후면서 모닝커피를 마신경우
            System.out.println("아이스 아메리카노 (디카페인) +1");
        } else { //2시 이전이고, 모닝커피를 마시지않았으면 기본 아아 주문
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
    }
}
