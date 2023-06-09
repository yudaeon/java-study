package nadoCoding.chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        //나코매장
        System.out.println("어서오세요. 나코입니다.");
        //또 다른 손님이 들어온다면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        //만약에 인사법이 바뀐다면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        //매장이름이 바뀐다면? 나코->코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다. ");

        System.out.println("------반복문 사용 -------");

        //이런 경우 for 반목문 사용
        for (int i = 0; i < 10; i++) {
            //  System.out.println("어서오세요. 나코입니다." + i);
            // System.out.println("환영합니다. 나코입니다." + i);
            System.out.println("환영합니다. 코나입니다." + i);
        }
        //짝수만 출력 (fori만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println(); //아무것도 안적고 줄바꿈하고싶을 때
        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();

        //거꾸로 출력하기
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();

        //1부터 10까지의 수들의 합
        // 1+2+ ... + 10 =55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // 1씩 증감
            System.out.println("현재까지 총합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다." );
    }
}