package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //"901231-1234567"인 경우 901231-1까지 출력
        String s1 = "901231-1234567";

        System.out.println(s1.substring(s1.indexOf("901231"), s1.lastIndexOf("2")));
        System.out.println(s1.substring(0, 8)); //0자리부터 8자리까지 출력
        System.out.println(s1.substring(0, s1.indexOf("-") + 2));//0위치부터 하이픈 위치 +2 직전까지 출력
    }
}
