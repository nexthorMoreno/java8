package co.com.chapter.one.buildingblocks;

/**
 * Created by nestor.moreno on 2017-02-20.
 */
class SimpleJavaClass2 {

}

public class SimpleJavaClass {
    private String name;
    static int MAX = 5;
	short numPets = 5;
	double in = 12;
	double in2 = 123f;
	double in3 = 123F;
	double in4 = 2D;
	double in5 = 0X5;
	float f = 5.2f;
    
    //this block is not called when we execute the InstanceInitializer class
    // this block is correctly called when we execute the SimpleJavaClass class
    {
    	System.out.println("Inside a instance initializer");
    	SimpleJavaClass.MAX = 8;
    }
    
    SimpleJavaClass() {
    	System.out.println("Inside SimpleJavaClass constructor!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SimpleJavaClass simpleJavaClass2 = new SimpleJavaClass();
        System.out.println(simpleJavaClass2.name);
        System.out.println(SimpleJavaClass.MAX);
    }
}

/**
 * It compiles without fail!
 * @author nestor.moreno
 *
 */
class SimpleJavaClassWithMain {
    public static void main(String[] args) {

    }
}

class InstanceInitializer {
	static int MAX_LENGTH = 5;
	
    // instance initializer block
    {
        System.out.println("Initializer block");
    }

    public void instanceInitializerBlock() {
    	//is not possible create a static field inside a method
    	//static int MAX_LENGTH = 5; 
    	
        // instance initializer block
        {
            System.out.println("Initializer block2");
        }
        
        SimpleJavaClass.MAX = 15;
    }

    public static void main(String[] args) {
        InstanceInitializer instanceInitializer = new InstanceInitializer();
        System.out.println("Inside main");
        //instanceInitializer.instanceInitializerBlock();
        System.out.println(SimpleJavaClass.MAX);
    }

}
