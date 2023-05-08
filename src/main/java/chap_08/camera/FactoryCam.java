package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

import java.util.Random;

public class FactoryCam extends Camera implements Detectable, Reportable { //카메라 부모클래스를 상속하는 자식 클래스
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFicture() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
    detector.detect();
    }

    @Override
    public void report() {
    reporter.report();
    }
}
