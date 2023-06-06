package nadoCoding.chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        //다차원 배열 순회
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        // 이중 반복문 : fori 안에 fori문 하나더
        for (int i = 0; i < 3; i++) { //세로  기준
            for (int j = 0; j < 5; j++) { //가로기준
                System.out.print(seats[i][j] + " "); //세로와 가로를 하나씩 순회하면서 출력
            }
            System.out.println();
            //A1 A2 A3 A4 A5
            //B1 B2 B3 B4 B5
            //C1 C2 C3 C4 C5 출력
        }
        System.out.println("----------------------------------");
        //첫 줄에는 3칸, 둘째줄에는 4칸, 셋째줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) { //세로 기준 seats2.length 사용
            for (int j = 0; j <seats2[i].length; j++) { //가로 기준
                System.out.print(seats2[i][j] + " "); //세로와 가로를 하나씩 순회하면서 출력
            }
            System.out.println();
        }

        System.out.println("---------------------");
        // 세로크기 10 x 가로크기 15에 해당하는 영화관 좌석
        String [][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표구매 H9 H10 좌석 나갔음
        seats3[7][8] = "__";
        seats3[7][9] = "__";

        //영화관 좌석 정보 확인
        for (int i = 0; i < seats3.length; i++) { //세로 기준 seats2.length 사용
            for (int j = 0; j <seats3[i].length; j++) { //가로 기준
                System.out.print(seats3[i][j] + " "); //세로와 가로를 하나씩 순회하면서 출력
            }
            System.out.println();
        }
    }
}