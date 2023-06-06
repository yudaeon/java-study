package javajungsuk;

class Data_1 {
    int value;
    //생성자가 하나도 없으므로 컴파일러가 자동으로 기본생성자를 생성한다.
}

class Data_2 {
    int value;

    Data_2() {} //기본생성자
    Data_2(int x) {  //매개 변수가 있는 생성자이므로 생성자를 지정해줘야한다.
        value = x;
    }
}

class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // compile error발생 -> 기본생성자 생성해야함
    }
}


