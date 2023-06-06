package nadoCoding.chap_08.camera;

public abstract class Camera { //abstrat 추가
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFicture(); //추상메소드 정의, 구현해야 하는 메소드
}
