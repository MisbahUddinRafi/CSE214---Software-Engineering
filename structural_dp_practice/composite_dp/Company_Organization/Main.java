package structural_dp_practice.composite_dp.Company_Organization;

import java.util.List;
import java.util.ArrayList;

public class Main { 
    public static void main(String[] args) {
        OrganizationComponent emp1 = new Employee("Bob", "HR Manager", 60000); 
        OrganizationComponent emp2 = new Employee("Carol", "Recruiter", 45000); 
        OrganizationComponent emp3 = new Employee("Alice", "Software Engineer", 70000); 
        OrganizationComponent emp4 = new Employee("David", "Security Officer", 35000); 
        
        List<OrganizationComponent> emplist1 = new ArrayList<>(List.of(emp1, emp2)); 
        // List<OrganizationComponent> emplist2 = new ArrayList<>(List.of(emp3, emp4));  

        OrganizationComponent hrDept = new Department("HR", emplist1); 
        Department securityDept = new Department("Security");  
        securityDept.add(emp4); 
        Department itDept = new Department("IT"); 
        itDept.add(emp3); 
        itDept.add(securityDept); 

        OrganizationComponent headOffice = new Department("Head Office", new ArrayList<>(List.of(hrDept, itDept)));  
        headOffice.showDetails();  
    }
}
