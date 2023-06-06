package nadoCoding.chap_03;
public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교

        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false 출력
        System.out.println(s2.equals("python")); //대소문자 구분됨
        System.out.println(s2.equalsIgnoreCase("python"));
        //대소문자 구분없이 문자열 내용이 같으면 true출력 equalsignorecase

        //문자열 비교 심화
        s1 = "1234"; //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true(내용) s1의 내용이 s2와 같으면 true, 틀리면 false
        System.out.println(s1 == s2); //true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false나오는 이유?
    }
}
