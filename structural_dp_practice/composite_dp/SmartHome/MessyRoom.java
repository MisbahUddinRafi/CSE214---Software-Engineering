package SmartHome;

import java.util.*;

// Rooms are basically a list of devices. But here, rooms can't just hold a list of "devices" — there's no shared type.
// So it holds three separate lists. Adding a fourth device type means
// editing Room, every helper method, and every demo.
public class MessyRoom {
    String name;
    List<Light> lights = new ArrayList<>();
    List<Thermostat> thermostats = new ArrayList<>();
    List<Speaker> speakers = new ArrayList<>();
    // Track insertion order separately because three lists lost it
    List<Object> insertionOrder = new ArrayList<>();

    // Room-level enhancement flags
    boolean ecoMode = false;
    double ecoBudget = 0;
    boolean guestMode = false;
    Set<String> guestAllowed = new HashSet<>(); // "light", "thermostat", "speaker"

    MessyRoom(String name) {
        this.name = name;
    }

    void addLight(Light l) {
        lights.add(l);
        insertionOrder.add(l);
    }

    void addThermostat(Thermostat t) {
        thermostats.add(t);
        insertionOrder.add(t);
    }

    void addSpeaker(Speaker s) {
        speakers.add(s);
        insertionOrder.add(s);
    }

    void activateAll() {
        if (guestMode) {
            // Only activate allowed types
            if (guestAllowed.contains("light"))
                for (Light l : lights)
                    l.activate();
            if (guestAllowed.contains("thermostat"))
                for (Thermostat t : thermostats)
                    t.activate();
            if (guestAllowed.contains("speaker"))
                for (Speaker s : speakers)
                    s.activate();
        } else {
            for (Light l : lights)
                l.activate();
            for (Thermostat t : thermostats)
                t.activate();
            for (Speaker s : speakers)
                s.activate();
        }

        // EcoMode: shed in reverse insertion order
        if (ecoMode && getTotalPower() > ecoBudget) {
            for (int i = insertionOrder.size() - 1; i >= 0 && getTotalPower() > ecoBudget; i--) {
                Object dev = insertionOrder.get(i);
                if (dev instanceof Light) {
                    ((Light) dev).deactivate();
                    System.out.println("    >> EcoMode: shed [" + ((Light) dev).getStatus() + "]");
                } else if (dev instanceof Thermostat) {
                    ((Thermostat) dev).deactivate();
                    System.out.println("    >> EcoMode: shed [" + ((Thermostat) dev).getStatus() + "]");
                } else if (dev instanceof Speaker) {
                    ((Speaker) dev).deactivate();
                    System.out.println("    >> EcoMode: shed [" + ((Speaker) dev).getStatus() + "]");
                }
                // Every new device type needs another else-if here
            }
        }
    }

    void deactivateAll() {
        for (Light l : lights)
            l.deactivate();
        for (Thermostat t : thermostats)
            t.deactivate();
        for (Speaker s : speakers)
            s.deactivate();
    }

    double getTotalPower() {
        double total = 0;
        if (guestMode) {
            if (guestAllowed.contains("light"))
                for (Light l : lights)
                    total += l.getPower();
            if (guestAllowed.contains("thermostat"))
                for (Thermostat t : thermostats)
                    total += t.getPower();
            if (guestAllowed.contains("speaker"))
                for (Speaker s : speakers)
                    total += s.getPower();
        } else {
            for (Light l : lights)
                total += l.getPower();
            for (Thermostat t : thermostats)
                total += t.getPower();
            for (Speaker s : speakers)
                total += s.getPower();
        }
        if (ecoMode && total > ecoBudget)
            total = ecoBudget;
        return total;
    }

    String getStatus() {
        StringBuilder sb = new StringBuilder("[" + name + "]");
        if (ecoMode)
            sb.insert(0, "[ECO: " + ecoBudget + "W budget]\n");
        if (guestMode)
            sb.insert(0, "[GUEST MODE]\n");

        // Can't just loop "devices" — have to loop each list separately
        for (Object dev : insertionOrder) {
            if (dev instanceof Light) {
                Light l = (Light) dev;
                sb.append("\n  ").append(l.getStatus());
                if (guestMode && !guestAllowed.contains("light"))
                    sb.append(" [guest-restricted]");
            } else if (dev instanceof Thermostat) {
                Thermostat t = (Thermostat) dev;
                sb.append("\n  ").append(t.getStatus());
                if (guestMode && !guestAllowed.contains("thermostat"))
                    sb.append(" [guest-restricted]");
            } else if (dev instanceof Speaker) {
                Speaker s = (Speaker) dev;
                sb.append("\n  ").append(s.getStatus());
                if (guestMode && !guestAllowed.contains("speaker"))
                    sb.append(" [guest-restricted]");
            }
            // ANOTHER else-if for every new device type
        }
        return sb.toString();
    }
}
