package BuilderPatternTest;

import java.util.LinkedList;
import java.util.List;

public class Factory {
    // just sample data
    public void buildSamsaungS24(Builder builder) {
        builder.setBattery(new Battery(5000L, "Lithium"));
        builder.setCamera(new Camera(4, "Leica"));
        builder.setChargerPort(ChargerPort.TYPE_C);
        builder.setCPU(new CPU("Snapdragon 8 Gen 3", "4nm"));
        builder.setDisplay(Display.SUPER_AMOLED);
        builder.setOS(OS.ANDROID);
        List<Sensor> sensorList = new LinkedList<>();
        sensorList.add(new Sensor("50 MP wide sensor", "Camera"));
        sensorList.add(new Sensor("10 MP 3x tele telephoto sensor", "Camera"));
        sensorList.add(new Sensor("200 MP wide sensor", "Camera"));
        sensorList.add(new Sensor("50 MP 5× tele periscope telephoto sensor", "Camera"));
        builder.setSensor(sensorList);
        builder.setSIM(List.of(SIM.NANO_SIM, SIM.E_SIM));
        builder.setSpeaker(Speaker.STERO_SPEAKER);
        builder.set5MMAudioJack(1);
    }
    public void buildIphone14(Builder builder) {
        builder.setBattery(new Battery(4000L, "Lithium"));
        builder.setCamera(new Camera(3, "Leica"));
        builder.setChargerPort(ChargerPort.LIGHTING);
        builder.setCPU(new CPU("A15 Bionic", "5nm"));
        builder.setDisplay(Display.SUPER_AMOLED);
        builder.setOS(OS.IOS);
        List<Sensor> sensorList = new LinkedList<>();
        builder.setSensor(sensorList);
        builder.setSIM(List.of(SIM.NANO_SIM, SIM.E_SIM));
        builder.setSpeaker(Speaker.STERO_SPEAKER);
    }
    // To Do
    public void buildGooglePixel8Pro(){}
}
