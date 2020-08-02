package sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private String measurements;
    private boolean isStamped;

    public Stamp (String name, String measurements, boolean isStamped){
        this.name = name;
        this.measurements = name;
        this.isStamped = isStamped;
    }
    public String getName() {
        return name;
    }
    public String getMeasurements() {
        return measurements;
    }
    public boolean getIsStamped() {
        return isStamped;
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
                        && Objects.equals(isStamped, stamp.isStamped);
    }
    @Override public int hashCode(){
        return Objects.hash(name, measurements, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", measurements='" + measurements + '\'' +
                ", isStamped='" + isStamped + '\'' +
                '}';
    }
}
