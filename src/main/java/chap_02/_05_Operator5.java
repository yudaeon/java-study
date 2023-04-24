package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (겨짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y; //x가 y보다 크면 x 출력
        System.out.println(max);

        int min = (x < y) ? x : y; //x가 y보다 작으면 x출력, 아니면 y출력
        System.out.println(min);

        x = 4;
        y = 3;
        boolean b = (x==y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);
    }
}
