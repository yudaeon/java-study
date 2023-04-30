package chap_04;

public class _09_MultipleTabel {
    public static void main(String[] args) {
        // 구구단 만들기 (이중반복문)
        for (int i = 2; i < 10; i++) { //구구단 2단~9단까지니까 i < 10
            for (int j = 1; j < 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}