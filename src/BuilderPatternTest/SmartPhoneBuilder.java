package BuilderPatternTest;


import java.util.List;

public class SmartPhoneBuilder implements Builder{
    private Battery battery;
    private Camera camera;
    private ChargerPort chargerPort;
    private CPU cpu;
    private Display display;
    private OS os;
    private List<Sensor> sensor;
    private List<SIM> sim;
    private Speaker speaker;
    private int audioJack;
    public SmartPhoneBuilder() {}
    public SmartPhoneBuilder(Battery battery, Camera camera, ChargerPort chargerPort, CPU cpu, Display display, OS os, List<Sensor> sensor, List<SIM> sim, Speaker speaker) {
        this.battery = battery;
        this.camera = camera;
        this.chargerPort = chargerPort;
        this.cpu = cpu;
        this.display = display;
        this.os = os;
        this.sensor = sensor;
        this.sim = sim;
        this.speaker = speaker;
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery =battery;
    }

    @Override
    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void setChargerPort(ChargerPort chargerPort) {
        this.chargerPort = chargerPort;
    }

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void setOS(OS os) {
        this.os = os;
    }

    @Override
    public void setSensor(List<Sensor> sensor) {
        this.sensor = sensor;
    }

    @Override
    public void setSIM(List<SIM> sim) {
        this.sim = sim;
    }

    @Override
    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    @Override
    public void set5MMAudioJack(int numberOfPort) {
        this.audioJack = numberOfPort;
    }

    public SmartPhone getSmartPhone() {
        return new SmartPhone(battery, camera, chargerPort, cpu, display, os, sensor,sim,speaker,audioJack);
    }
}
