package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능, 단 공백은 사용 불가
        // 3. 밑줄 또는 문자로 사용 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자로 (첫단어는 소문자로)
        // 6. 예약어 사용 불가 (public, static, void, double, float ...)

        // 다른 나라 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "다언";
        String lastName = "유";
        String dateOfBirth = "1998-03-05";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";
//        String -flightNo =

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        // 절대 변하지 않는 상수는 대문자로 적어야함
        final String CODE = "KR";
//        CODE = "US";
        //나라이름과 같이 변하지 않는 상수는 대문자로 적어야함
    }
}
