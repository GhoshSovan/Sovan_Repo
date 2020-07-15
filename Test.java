public class Test //Multiple overload
{ 
    // Overloaded methods 
    public void fun(Integer i) 
    { 
        System.out.println("fun(Integer ) "); 
    } 
    public void fun(String name) 
    { 
        System.out.println("fun(String ) "); 
    } 
  
    // Driver code  
    public static void main(String [] args) 
    { 
        Test mv = new Test(); 
        Integer arg = null;
        // This line causes error 
        mv.fun(arg); 
    } 
} 