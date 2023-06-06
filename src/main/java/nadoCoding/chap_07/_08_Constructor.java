package nadoCoding.chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "블랙";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("-------------");
        //생성자를 이용하면 편리하게 할 수 있다.

        BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
//        System.out.println(b2.resolution);
//        System.out.println(b2.price);
//        System.out.println(b2.color);
    }
}
