package nadoCoding.chap_08.reporter;

public class NormalReporter implements Reportable { //인터페이스에서는 extends대신 implements 사용

    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
