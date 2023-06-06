package nadoCoding.chap_07;

public class _01_Class {
    //클래스
    public static void main(String[] args) {
        // 객체지향프로그래밍 (OOP:Object-Oriented-Programming)
        // 유지보수 용이
        // 높은 재사용성
        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        //우리가 만든 첫번째 상품

        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        //새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        //또 다른 제품을 개발
        BlackBox bbox = new BlackBox();
        //블랙박스 클래스로부터 비박스라는 객체를 생성
        // 비박스 객체는 블랙박스 클래스의 인스턴트이다.

        BlackBox bbox2 = new BlackBox();

    }
}
