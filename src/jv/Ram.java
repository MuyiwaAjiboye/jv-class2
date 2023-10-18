package jv;

public class Ram {
    int capacity;

    String type;

    @Override
    public String toString() {
        return "Ram{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                '}';
    }

    public Ram(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }


}
