package SmartHome; 

public class Light {
    boolean on = false;
    // Pro upgrade flags
    boolean accessRestricted = false;
    int pin = 0;
    boolean locked = false;
    boolean timerControlled = false;
    int timerSeconds = 0;
    boolean timerRunning = false;
    boolean powerThrottled = false;
    double powerCap = 0;

    void activate() {
        if (accessRestricted && locked) return;
        on = true;
        if (timerControlled) timerRunning = true;
    }

    void deactivate() {
        if (accessRestricted && locked) return;
        on = false;
        timerRunning = false;
    }

    double getPower() {
        double p = on ? 10.0 : 0.0;
        if (powerThrottled && p > powerCap) p = powerCap;
        return p;
    }

    String getStatus() {
        String s = "Light: " + (on ? "ON" : "OFF");
        if (accessRestricted && locked) s += " [LOCKED]";
        if (timerControlled && timerRunning) s += " (auto-off in " + timerSeconds + "s)";
        if (powerThrottled && on && 10.0 > powerCap) s += " [throttled to " + powerCap + "W]";
        return s;
    }
}