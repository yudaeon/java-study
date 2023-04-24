package chap_03;
public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(escape sequence, escape character, special character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); //문자열내에서 엔터치는거 \n 사용

        //해물파전       9000원
        //김치전        8000원
        //부추전        8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원"); //자동적으로 탭할때 \t사용

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java"); // 역슬래시 두개 입력하면 한개만 출력 파일경로나 폴더경로 출력시사용

        // 문장안에 큰따옴표, 작은따옴표 넣을때 역슬래시 사용 (" \"\" ") 퐁당퐁당 사용
        System.out.println("담비가 \"냐옹\"이라고 했어요");
        System.out.println("담비가 \'뭘 봐?\'라는 표정을 지었어요");
        System.out.println("담비가 '뭘 봐?'라는 표정을 지었어요");

        char c = 'A';
        c = '\''; //작은 따옴표 글자 한개만 출력하고 싶을 때
        System.out.println(c);
    }
}