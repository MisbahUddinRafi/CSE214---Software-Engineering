package structural_dp_practice.composite_dp.SmartHome;

public interface SmartDevice {
    void activate(); 
    void deactivate(); 
    double getPowerUsage(); 
    String getStatus(); 
    Class<?> getDeviceType(); 
}
