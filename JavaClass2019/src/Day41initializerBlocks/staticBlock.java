package Day41initializerBlocks;

public class staticBlock{

	//constructor below, will be executed when we create an abject of the class
    //... in main method
    
    public staticBlock () {
        System.out.println("constructor"); 
    }
    
    //1. static block executed as soon as the clas is loaded
        
    public static void main(String[] args) {
        
        //thrn object = constructor 
        staticBlock obj1  = new staticBlock();
        
        //then main method
        System.out.println("main method");
        staticBlock obj2  = new staticBlock();
        
    }
    
    
    
    //static will be executed first  ;; multiple from top to bottom
    //static is loaded first then checks main method
    static {
        System.out.println("-----------------");
        System.out.println("static block 1A ");  //// static only executes one time - as soon as loaded
        System.out.println("static block 1B"); 
    System.out.println("--------------"); 
    }
    
    static {
        System.out.println("static block 2A");
        System.out.println("=======");
    }
    
    
    //static block is usually used for initializing variables
    // not for printing or executing first
    
}