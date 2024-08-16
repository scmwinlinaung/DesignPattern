package BuilderPatternTest;

import java.util.List;

public interface Builder {
    void setBattery(Battery battery);
    void setCamera(Camera camera);
    void setChargerPort(ChargerPort chargerPort);
    void setCPU(CPU cpu);
    void setDisplay(Display display);
    void setOS(OS os);
    void setSensor(List<Sensor> sensor);
    void setSIM(List<SIM> sim);
    void setSpeaker(Speaker speaker);
    void set5MMAudioJack(int numberOfPort);
}
