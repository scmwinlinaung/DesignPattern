package BuilderPatternTest;

import java.util.List;

public class SmartPhone {
    private final Battery battery;
    private final Camera camera;
    private final ChargerPort chargerPort;
    private final CPU cpu;
    private final Display display;
    private final OS os;
    private final List<Sensor> sensor;
    private final List<SIM> sim;
    private final Speaker speaker;
    private final int audioJack;

    public SmartPhone(Battery battery, Camera camera, ChargerPort chargerPort, CPU cpu, Display display, OS os, List<Sensor> sensor, List<SIM> sim, Speaker speaker, int audioJack) {
        this.battery = battery;
        this.camera = camera;
        this.chargerPort = chargerPort;
        this.cpu = cpu;
        this.display = display;
        this.os = os;
        this.sensor = sensor;
        this.sim = sim;
        this.speaker = speaker;
        this.audioJack = audioJack;
    }

    public Battery getBattery() {
        return battery;
    }

    public Camera getCamera() {
        return camera;
    }

    public ChargerPort getChargerPort() {
        return chargerPort;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Display getDisplay() {
        return display;
    }

    public OS getOs() {
        return os;
    }

    public List<Sensor> getSensor() {
        return sensor;
    }

    public List<SIM> getSim() {
        return sim;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public int getAudioJack() {
        return audioJack;
    }
    public SmartPhone getSmartPhone() {
        return new SmartPhone(battery, camera, chargerPort, cpu, display, os, sensor, sim,speaker,  audioJack);
    }
}
