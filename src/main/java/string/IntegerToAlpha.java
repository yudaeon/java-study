package string;

public class IntegerToAlpha {
    public String itoa(int value){
        StringBuilder answerBuilder = new StringBuilder();
        // TODO: value가 0보다 큰 동안
        // TODO: value를 10으로 나눈 나머지를 문자로 변환
        // TODO: value 나누기 10
        while (value > 0){
            char digiChar = (char) (value % 10 + '0');
            value /= 10;
            answerBuilder.append(digiChar);
        }
        return answerBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        IntegerToAlpha itoa = new IntegerToAlpha();
        //123456789
        System.out.println(itoa.itoa(1234)+ itoa.itoa(56789));
    }
}
