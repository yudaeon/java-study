package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩"; //name이라는 문자열 변수가 선언됐음
        int hour = 15; //정수형 변수 선언

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.144567879;
        float f = 3.1434567888F; //실수를 float자료형으로 만들어야함, 뒤에 F 입력
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; //int 자료형을 long형으로 변환, int 자료형은 너무 길면 에러나기때문에
        l = 1_000_000_000_000L;
        System.out.println(l);

        //정수형 = int, long. 실수헝 = float, double. 문자형 = char, String, boolean.

    }
}