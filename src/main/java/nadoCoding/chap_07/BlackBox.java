package nadoCoding.chap_07;

public class BlackBox {
    //설계도
    String modelName; //모델명
    String resolution; //해상도
    int price; // 가격
    String color; //색상
    int serialNumber; //시리얼 번호

    static int counter = 0; //시리얼 번호를 생성해주는 역할( 처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    //static~ 클래스 내에 클래스 변수
    static boolean canAutoReport = false; //자동신고기능

    //생성자 만들기(클래스명과 동일하게)
    BlackBox(){
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution,int price, String color){
//        this(); //기본생성자호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }


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

     void appendModelName(String modelName ) {
       this.modelName += modelName; //인스턴스변수와 파라미터 변수의 이름이 중복이라면 앞에 this.붙이면 됨
    }

    //Getter(값을 가져옴) & Setter(값을 설정)
    String getModelName (){
        return modelName;
    }
    void setModelName(String modelName){
        this.modelName = modelName;
    }
    String getResolution(){
        if (resolution == null || resolution.isEmpty()) { //resolution이 널값이거나, 비어있다면
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }
    void setResolution(String resolution){
        this.resolution = resolution;
    }
    int getPrice(){
        return price;
    }
    void setPrice(int price){
        if (price < 100000) {
            this.price = 100000; //price가 100000원보다 크다면 그냥 100000원으로 설정
        }
        else {
            this.price = price;
        }
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
}

