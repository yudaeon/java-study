package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstactClass {
    public static void main(String[] args) {
        //데이터 추상화(Data Abstraction)
        //abstract
        //추상 클래스 : 아직 완성되지 않은 형태의 클래스 (객체로 만들 수 없음)
        //추상 메소드 : 추상 클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드

        // Camera camera = new Camera(); //추상클래스여서 객체로 만들 수 없다는 경고창이 뜬다
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFicture();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFicture();
    }
}
