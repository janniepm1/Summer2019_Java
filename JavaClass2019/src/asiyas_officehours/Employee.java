package asiyas_officehours;

public class Employee {
//constructor is invisible
    
    public Employee() { 
        SSN = 0;
        name = "Not written yet";
        System.out.println("This is constructor without argument ");
        
    }
    
                    //local
    public Employee(int SSN, String name, int age, double salary) {
    
        
        this.SSN = SSN;
        this.name = name;
        this.age = age;
        this.salary = salary;
        System.out.println("Overloaded constructor");
    }
    //instance
    int SSN;
    String name;
    int age;
    double salary;
    
    public void work() {
        System.out.println("the employee is working");
    }
    
    static {
        System.out.println("Welcome to Cybertek " + "this is static block");
    }
    
    {
        System.out.println("Hi, good morning" + "This is init block");
    }
    
    
    
    
    public static void main(String[] args) { //static --> Ini + cons 
        //how to create obj?
        
        Employee e1 = new Employee(); 
        Employee e2 = new Employee(); 
        
        Employee e3 = new Employee(6573, "Vasya", 18, 10098405);
        
    }
}



