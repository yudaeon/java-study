package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키 코드(ANSI) : 미국 표준 코드
        char c = 'A'; //알파벳 대문자(A)는 65부터시작, 소문자(a)는 97부터 시작, 숫자(0)는 48부터 시작함
        System.out.println(c);
        System.out.println((int)c); //아스키코드 65가 출력됨

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);
        System.out.println("----------------");


        // 세로크기 10 x 가로크기 15에 해당하는 영화관 좌석
        String [][] seats3 = new String[10][15];
       char ch = 'A';

        for (int i = 0; i < seats3.length; i++) { //세로
            for (int j = 0; j < seats3[i].length; j++) { //가로
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
            //영화관 좌석 정보 확인
            for (int i = 0; i < seats3.length; i++) { //세로 기준 seats2.length 사용
                for (int j = 0; j <seats3[i].length; j++) { //가로 기준
                System.out.print(seats3[i][j] + " "); //세로와 가로를 하나씩 순회하면서 출력
                }
                System.out.println();
            }

        }
    }
