package jv;

public class Cpu {
    double speed;
    String type;

    @Override
    public String toString() {
        return "Cpu{" +
                "speed=" + speed +
                ", type='" + type + '\'' +
                '}';
    }

    public Cpu(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }




}
