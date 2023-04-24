package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 typecasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

      //int to float, double
        int score = 93; // 93출력
        System.out.println(score);
        System.out.println((float) score); //실수형 자료형변환 -> 93.0 출력
        System.out.println((double) score); //더블로 형변환 ->93.0 출력

        //float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        //정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score);

        score_d = (double) 93 + 98.8; //정수와 실수 연산이지만 자동으로 double로 변환
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191->191.0
        System.out.println(score);
        //int -> long -> float -> double
        // 작은거에서 큰거로 갈때에는 자동형변환이 생성됨

        int convertedScoreInt = (int) score_d; //191.8->191
        //double -> float -> long -> int 큰거에서 작은거로 갈때에는 수동형변환을 해야함

        // 숫자를 문자열로 변환할 때
        String s1 = String.valueOf(93); //스트링클래스에 93 정수를 문자열로 바꿔서 넣기'
        s1 = Integer.toString(93); //정수를 문자열로 바꿔주는거
        System.out.println(s1);

        //실수를 문자열로 바꾸기
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8); //실수를 문자열로
        System.out.println(s2); //98.8이 나와야함

        //문자열을 숫자로 바꾸기
        int i =  Integer.parseInt("93");
        System.out.println(i);

        //실수형을 더블로 바꾸기
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("자바"); 괄호안에 문자가 정확하지 않으면 에러가 나기때문에 정확하게 입력 필요

    }
}
