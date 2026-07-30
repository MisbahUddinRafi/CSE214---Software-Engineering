package SmartHome;

public class EcoMode extends SmartCompositeDecorator {
    private double ecoBudget; 

    public EcoMode(SmartComposite wrapped, double ecoBudget) {
        super(wrapped);
        this.ecoBudget = ecoBudget; 
    }

    // private helper method for maintaining eco mode 
    private void maintainEcoBudget() {
        while (super.getPowerUsage() > this.ecoBudget) { 
            if (wrapped.deactivateLastActiveDevice() == false) {
                break; 
            }
        }
    }

    @Override
    public void activate() {
        super.activate(); 
        this.maintainEcoBudget();   // deactivate latest devices 
    }

    @Override
    public void deactivate() {
        super.deactivate();
    }

    @Override
    public double getPowerUsage() {
        return super.getPowerUsage();
    }

    @Override
    public String getStatus() { 
        StringBuilder sb = new StringBuilder(super.getStatus()); 
        sb.append("[ECO: " + ecoBudget + "W budget]\n"); 
        return sb.toString(); 
    } 

    
}
