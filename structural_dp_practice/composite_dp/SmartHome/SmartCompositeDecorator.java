package SmartHome;

public abstract class SmartCompositeDecorator implements SmartDevice {
    protected SmartComposite wrapped; 

    public SmartCompositeDecorator(SmartComposite wrapped) {
        this.wrapped = wrapped; 
    }

    @Override
    public void activate() {
        wrapped.activate();
    }

    @Override
    public void deactivate() {
        wrapped.deactivate();        
    }

    @Override
    public double getPowerUsage() {
        return wrapped.getPowerUsage();
    }

    @Override
    public String getStatus() {
        return wrapped.getStatus();
    }

    @Override
    public Class<?> getDeviceType() {
        return wrapped.getDeviceType(); 
    }
}
