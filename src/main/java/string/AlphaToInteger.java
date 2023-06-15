package string;

public class AlphaToInteger {
    public int atoi(String value) {
        int result = 0;
        boolean negative = false;
        int i = 0;
        if (value.charAt(i) == '-') {
            i++;
            negative = true;
        }
        for (; i < value.length(); i++) {
            result *= 10;
            result += value.charAt(i) - '0';
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        AlphaToInteger atoi = new AlphaToInteger();
        System.out.println((int)'0');
        System.out.println(atoi.atoi("-1234"));
    }
}