package builder_dp.house_construction_system;

public class Main {
    public static void main(String[] args) {
        HouseBuilder hb = new LuxuryHouseBuilder(); 

        House h1 = hb.build(); 
        h1.getHouseDetails(); 
        System.out.println("\n" + "-".repeat(32) + "\n");
        
        House h2 = hb.build(); 
        h2.getHouseDetails();
    }
}
