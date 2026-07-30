package SmartHome;

import java.util.*;

// Home is basically Room's logic copy-pasted with "rooms" instead of "devices"
public class MessyHome {
    String name;
    List<MessyRoom> rooms = new ArrayList<>();
    // Home-level eco/guest — duplicated from Room
    boolean ecoMode = false;
    double ecoBudget = 0;
    boolean guestMode = false;
    Set<String> guestAllowed = new HashSet<>();

    MessyHome(String name) {
        this.name = name;
    }

    void addRoom(MessyRoom r) {
        rooms.add(r);
    }

    void activateAll() {
        for (MessyRoom r : rooms)
            r.activateAll();
        // Home-level eco — completely separate logic from Room-level eco
        if (ecoMode && getTotalPower() > ecoBudget) {
            // Shed entire rooms in reverse order... ugly
            for (int i = rooms.size() - 1; i >= 0 && getTotalPower() > ecoBudget; i--) {
                rooms.get(i).deactivateAll();
            }
        }
    }

    void deactivateAll() {
        for (MessyRoom r : rooms)
            r.deactivateAll();
    }

    double getTotalPower() {
        double total = 0;
        for (MessyRoom r : rooms)
            total += r.getTotalPower();
        if (ecoMode && total > ecoBudget)
            total = ecoBudget;
        return total;
    }

    String getStatus() {
        StringBuilder sb = new StringBuilder("=== " + name + " ===");
        if (ecoMode)
            sb.insert(0, "[ECO: " + ecoBudget + "W budget]\n");
        if (guestMode)
            sb.insert(0, "[GUEST MODE]\n");
        for (MessyRoom r : rooms)
            sb.append("\n").append(r.getStatus());
        return sb.toString();
    }
}
