package chap_03;

public class _01_String {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 알기
        System.out.println(s.length()); //29자

        //대소문자 변환
        System.out.println(s.toUpperCase()); //전부다 대문자로
        System.out.println(s.toLowerCase()); //전부다 소문자로

        //포함 관계
        System.out.println(s.contains("Java")); //Java가 포함되어있으므로 true
        System.out.println(s.contains("C#")); //없으므로 false
        System.out.println(s.indexOf("Java")); //java가 어디에 위치되어있는지, 첫글자는 0부터
        System.out.println(s.indexOf("C#")); //포함되어있지않으므로 -1로 반환
        System.out.println(s.indexOf("and")); //처음일치하는 and 위치정보
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 and 위치정보
        System.out.println(s.startsWith("I like")); //이 문자열로 시작하는게 맞으면 true 출력, 아니면 false출력
        System.out.println(s.endsWith(".")); //이 문자열로 끝나면 true, 아니면 false출력

    }
}
