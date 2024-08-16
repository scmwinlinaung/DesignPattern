package BuilderPatternTest;

public class Camera {
    private int lens;
    private String sensor;

    public Camera(int lens, String sensor) {
        this.lens = lens;
        this.sensor = sensor;
    }

    public int getLens() {
        return lens;
    }

    public void setLens(int lens) {
        this.lens = lens;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
}
