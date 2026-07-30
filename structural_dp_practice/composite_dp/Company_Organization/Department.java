import java.util.List;
import java.util.ArrayList;

public class Department implements OrganizationComponent {
    private String departmentName; 
    private List<OrganizationComponent> components;

    public Department(String departmentName) {
        this.departmentName = departmentName; 
        this.components = new ArrayList<>(); 
    }

    public Department(String departmentName, List<OrganizationComponent> components) {
        this.departmentName = departmentName;
        this.components = new ArrayList<>(components);
    }

    public void add(OrganizationComponent obj) {
        components.add(obj); 
    }

    public void remove(OrganizationComponent obj) {
        components.remove(obj); 
    }

    @Override
    public void showDetails() {
        System.out.println("Department: " + departmentName + "\n"); 
        
        for (OrganizationComponent obj: components) { 
            obj.showDetails();
        }        
        
    } 
    

    // getter and setter methods --------------------------------
    public String getDepartmentName() {
        return departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public List<OrganizationComponent> getcomponents() {
        return new ArrayList<>(components);
    }
    
    public void setcomponents(List<OrganizationComponent> components) {
        this.components = components;
    }

}
