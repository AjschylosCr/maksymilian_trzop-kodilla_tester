package sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Havaya", "30x14.2mm", false));
        stamps.add(new Stamp("Pacifica", "28x20mm", false));
        stamps.add(new Stamp("Pacifica", "28x20mm", false));
        stamps.add(new Stamp("Zealandia", "32x22mm", true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
