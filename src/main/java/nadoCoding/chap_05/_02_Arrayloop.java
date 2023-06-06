package nadoCoding.chap_05;

public class _02_Arrayloop {
    public static void main(String[] args) {
        // 배열의 순회 (1차원배열)
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"} ;
        System.out.println(coffees[0] + " 하나");

        //for 반복문 순회 (i값만 바꿔서 반복문 수행할 수 있음)
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");
        // 배열의 길이를 이용한 순회 방법 (for i)
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("------------------------");

        // enhanced for (for-each) 반복문 (coffees에 있는 배열들을 순서대로 순회하는것)
        for (String coffee : //foreach 사용하면 빠르게 for문 수행 가능
                coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
