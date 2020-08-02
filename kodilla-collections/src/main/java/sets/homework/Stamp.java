package sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String measurements;
    private String ifStamped;

    public Stamp (String name, String measurements, String ifStamped){
        this.name = name;
        this.measurements = name;
        this.ifStamped = ifStamped;
    }
    public String getName() {
        return name;
    }
    public String getMeasurements() {
        return measurements;
    }
    public String getIfStamped() {
        return ifStamped;
    }

    @Override public boolean equals(Object o){
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return
                Objects.equals(name, stamp.name)
                        && Objects.equals(measurements, stamp.measurements)
                        && Objects.equals(ifStamped, stamp.ifStamped);
    }
    @Override public int hashCode(){
        return Objects.hash(name, measurements, ifStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", measurements='" + measurements + '\'' +
                ", ifStamped='" + ifStamped + '\'' +
                '}';
    }
}
