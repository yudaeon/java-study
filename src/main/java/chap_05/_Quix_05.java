package chap_05;

public class _Quix_05 {
    public static void main(String[] args) {
        int[] size = new int[10] ;
        for (int i = 0; i <size.length; i++) {
            size[i] = 250 + (5 * i);
        }
        for (int sizes: size) {
        System.out.println("사이즈 " + sizes + " (재고 있음)");
        }
    }
}

