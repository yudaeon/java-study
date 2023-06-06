package nadoCoding.chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25; //수영장전체거리
        int move = 0; //현재이동거리
        int height = 2; //키 2미터
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3; //3m이동
        }
        System.out.println("도착했습니다.");
        System.out.println("----반복문 #1---");
        //키가 엄청 큰 사람이 수영한다면?
        move = 0;
        height = 25;
        while (move + height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3; //3m이동System.out.println();
        }
        System.out.println("도착했습니다.");
        System.out.println("----반복문 #2---");
        //Do While?
        do{
            System.out.println("발차기를 계속합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        } while (move+ height < distance);
        System.out.println("도착했습니다.");
    }
}
