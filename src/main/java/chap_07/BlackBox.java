package chap_07;

public class BlackBox {
    //설계도
    String modelName; //모델명
    String resolution; //해상도
    int price; // 가격
    String color; //색상

    //static~ 클래스 내에 클래스 변수
    static boolean canAutoReport = false; //자동신고기능

    void autoReport() {
     if(canAutoReport) {
         System.out.println("충돌이 감지되어 자동으로 신고합니다.");
     }else {
         System.out.println("자동 신고 기능이 지원되지 않습니다.");
     }
    }
    void insertMemortCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileConunt (int type){
        if (type == 1){ //일반영상
            return  9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }
    //showDateTime : 날짜정보 표시여부
    //showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)

    void record(boolean showDateTime, boolean showSpeed, int min) {
            System.out.println("녹화를 시작합니다.");
            if (showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
            if (showDateTime){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
            System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }
    void record(){
        record(true, true, 5);
    }
    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        // modelName = "test"; 스테틱 클래스 메소드 내에서는 직접접근이 불가함,

    }
}

