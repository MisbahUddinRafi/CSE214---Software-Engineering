package structural_dp_practice.composite_dp.Company_Organization;

public class Employee implements OrganizationComponent {
    private String name; 
    private String designation; 
    private double salary;


    public Employee(String name, String designation, double salary) {
        this.name = name; 
        this.designation = designation; 
        this.salary = salary; 
    }

    @Override
    public void showDetails() { 
        System.out.println("Employee: "); 
        System.out.println("Name: " + this.name); 
        System.out.println("Designation: " + this.designation);
        System.out.printf("Salary: " + this.salary); 
        System.out.println();        
    }


    // getter and setter methods --------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    } 
    
}
