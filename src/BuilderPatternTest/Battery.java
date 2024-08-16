package BuilderPatternTest;

public class Battery {
    private Long capacity;
    private String type;

    public Battery(Long capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
