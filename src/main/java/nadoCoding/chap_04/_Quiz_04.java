package nadoCoding.chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; //주차시간
        boolean isSmallCar = false; //경차 여부
        boolean withDisabledPerson = false; //장애인 차량 여부

        int fee = hour * 4000; //시간당 4000원 곱하기
        //30000원 초과시 일일 최대요금을 수정
        if (fee > 30000){
            fee = 30000; //fee를 일일 최대요금 3만원으로 변경하게끔
        }
        //경차 또는 장애인 차량인 경우 50%할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; //fee 50%할인
        }
        //실행결과출력 주차요금은 xx원입니다.
        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    }
}
