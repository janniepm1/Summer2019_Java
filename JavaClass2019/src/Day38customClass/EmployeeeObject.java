package Day38customClass;

public class EmployeeeObject {
	public static void main(String[] args) {
        
	    
	    
	    Employee employee1 = new Employee();
	    
	    employee1.Name = "Muhtar Mahmut";
	    employee1.ID = 453323;
	    employee1.JobTitle = "JAVA Instructor";
	    employee1.SSN = 986_56_7765;
	    employee1.Gender = "M";
	    employee1.Salary = 140000;
	    
	    System.out.println(employee1.Name);
	    System.out.println(employee1.ID);
	    System.out.println(employee1.JobTitle);
	    System.out.println(employee1.SSN);
	    System.out.println(employee1.Gender);
	    System.out.println(employee1.Salary);
	    System.out.println("----------------------------------");
	    
	    Employee employee2 = new Employee();
	    
	    
	    employee2.Name = "Marufjon John";
	    employee2.ID = 453435;
	    employee2.JobTitle = "Selenium Instructor";
	    employee2.SSN = 575_34_3345;
	    employee2.Gender = "M";
	    employee2.Salary = 150000;
	    
	    System.out.println(employee2.Name);
	    System.out.println(employee2.ID);
	    System.out.println(employee2.JobTitle);
	    System.out.println(employee2.SSN);
	    System.out.println(employee2.Gender);
	    System.out.println(employee2.Salary);
	    System.out.println("----------------------------------");
	    
	    employee1.teach();
	    employee2.teach();
	    
	    employee1.get();
	    employee2.get();
	    
	    employee1.getInfo();
	    employee2.getInfo();
	}

}
