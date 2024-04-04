package co.com.chapter.six.exceptionhandling;

/**
 * Created by nestor.moreno on 2017-02-14.
 * Remember: The exceptions alter the program flow
 * Remember2: Throwable is the superclass of the exceptions
 * Remember3: Checked exceptions are Error conditions => java.lang.Exception  include all the subclasses of it
 * Remember4: Unchecked exceptions are the java.lang.RuntimeExceptions and the descendant of it, this kind
 *            of error are not necessarily fatal.
 * Remember5: Error Not catchable by the program is not required handle it by the program and it's a subclass of Error.
 */
public class Zoo {
    public static void main(String[] args) {
        String[] animals = new String[0]; //is valid but not usable
        System.out.println(animals[0]); //throws an ArrayIndexOutOfBoundsException

        System.out.println(args[0]);
        System.out.println(args[1]);

        //forms to throw an exceptions by hand
        /*
        throw new Exception();
        throw new Exception("Ow! I fell.");
        throw new RuntimeException();
        throw new RuntimeException("Ow! I fell.");
        */
    }

    /**
     * @param names
     * @param name
     * @return
     */
    public int indexOf(String[] names, String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * The checked exceptions requires two approaches: handle of declare them in the method signature
     *
     */

    /**
     * Approach one: declare the exception on the method signature
     * @throws Exception
     */
    public void fall() throws Exception { //this is important, not optional
        throw new Exception();     //this is important throw
    }

    /**
     * Use of the try catch block
     * Remember6: The braces are required
     * Remember7: The Catch block is required only if does not exists an finally block
     * Remember8: The checked exceptions must be propagated between methods
     */
   public void explore() {
        try {
            fall(); //This exception must be propagated
            System.out.println("neger get here");
        } catch(RuntimeException e) {
            getUp();
        } finally{
            System.out.println("Always executed");
        }
        seeAnimal();
    }

    /**
     * Remember7: The Catch block is required only if does not exists an finally block
     */
    public void explore2() throws Exception {
        try {
            fall(); //This exception must be propagated
            System.out.println("neger get here");
        } finally{
            System.out.println("Always executed");
        }
        seeAnimal();
    }

    /**
     * Remember9: When we execute an System.exit(0) inside an try or catch block,
     * the finally block never will be executed
     */
    public void explode3() {
        try {

        } catch (Exception e){
            System.out.println("Errrorrror explode3");
            System.exit(0);
        } finally {
            System.out.println("This block never will be executed");
        }
    }

    public void getUp() {
        System.out.println("getUping!!");
    }

    public void seeAnimal() {
        System.out.println("Seeing the animal!!");
    }



}
