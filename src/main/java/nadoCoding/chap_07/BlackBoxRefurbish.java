package nadoCoding.chap_07;

public class BlackBoxRefurbish {
    public String modelName; //모델명 public
    String resolution; //해상도 defalut
    private int price; // 가격 private
    protected String color; //색상 protected

     String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) { //resolution이 널값이거나, 비어있다면
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    private int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000; //price가 100000원보다 크다면 그냥 100000원으로 설정
        }
        else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

