package jv;

public class Computer {
    int screenSize;

    @Override
    public String toString() {
        return "Computer{" +
                "screenSize=" + screenSize +
                ", myCpu=" + myCpu +
                ", myRam=" + myRam +
                '}';
    }

    public Computer(int screenSize, Cpu myCpu, Ram myRam) {
        this.screenSize = screenSize;
        this.myCpu = myCpu;
        this.myRam = myRam;
    }

    Cpu myCpu;
    Ram myRam;


}
