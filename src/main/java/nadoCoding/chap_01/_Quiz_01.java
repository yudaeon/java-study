package nadoCoding.chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {

   // 1. 버스번호는 "1234", "상암08"과 같은 형태
   String busNo = "상암08";

   // 2. 남은 시간은 분단위 "3분"
    int minute = 3;


  //  3. 남은 거리는 km 단위 1.2km
    double distance = 1.2;
   /*실행결과
    상암08번 버스
    약 3분 후 도착
    남은 걸 ㅣ1.2km */

    System.out.println(busNo + "번 버스");
    System.out.println("약" + minute + "분 후 도착");
    System.out.println("남은 거리 " + distance + "km");
    }
}
