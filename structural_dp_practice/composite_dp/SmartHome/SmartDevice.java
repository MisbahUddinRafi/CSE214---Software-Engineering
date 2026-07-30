package SmartHome;

public interface SmartDevice {
    void activate(); 
    void deactivate(); 
    double getPowerUsage(); 
    String getStatus(); 
    Class<?> getDeviceType(); 
}
