package nadoCoding.chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 반환
        System.out.println(s.replace(" and", ",")); //문자열을 교체하기
        System.out.println(s.substring(7)); //인덱스 기준 7부터 시작(이전 내용은 잘라내고 출력함)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //java로 시작해서 .직전까지 출력하고 뒤에는 삭제

        //공백 제거
        s = "         I love Java.       ";
        System.out.println(s);
        System.out.println(s.trim()); //앞뒤로 불필요한 공백 삭제해서 출력됨

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); //두문장 결합 javapython
        System.out.println(s1 + "," + s2); //두문장 사이에 콤마 넣기 java,python
        System.out.println(s1.concat(",").concat(s2)); //java,python
    }
}
