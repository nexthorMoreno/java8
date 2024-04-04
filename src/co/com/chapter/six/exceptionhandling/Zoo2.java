package co.com.chapter.six.exceptionhandling;

import javax.naming.NamingException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.activation.ActivationException;

/**
 * Created by nestor.moreno on 2017-02-15.
 * Remember: the RuntamienExceptions can not be declared or handled, can be executed by the programmer and JVM.
 * Remember: checked exceptions are FileNotFoundException, IOException, can be executed by the programmer and JVM.
 * Remember: Errors can be stackOverflowError
 * Remember: Runtime exceptions can be thrown in any method
 * Remember: The same exception can’t be specified in two different catch blocks
 * Remember: The exceptions fired by the JVM are ArrayIndexOutOfBoundsException, ExceptionInInitializerError, NullPointerException
 */
public class Zoo2 {
    float value1 = 102;
    float value = (int) 102.0;
    float value2 = 1f * 0.0;
    float value3 = 1f * (short)0.0;
    float vlaue5 = 1f * (boolean)0;

    private int numberEggs = 0;
    public Zoo2() {

    }

    /**
     * Remember2: The try catch block can be nested
     * Remember: the hierarchical order of the catch exceptions must be respected
     * @param args
     */
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch ( IOException e) {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch (IOException inner) {

            }
        } catch (Exception e) {  //if this exception will exists first than IOException the code does not will compile
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     * @throws Exception
     */
    private static FileReader read() throws Exception {
        //
        FileReader fileReader = new FileReader("tons.txt");
        if(fileReader != null) {
            fileReader.read();
        }

        return fileReader;
    }

    /**
     * Remember1: the catch block can reference 1 ..* Exceptions, but
     * it's must be ordered from specialized to general exceptions
     */
    public void visitPorcupine() {
        try {
            System.out.println("Hello visitPorcupine");
        } /*catch (NamingException ne ) {
        // the most specialized exception
        }*/ catch (Exception ex){

        }
    }

    /**
     * IllegalArgumentException is and Runtime Exception
     */
    public void illegalArgumentExceptionExample(int numberEggs) {
        if(numberEggs <0) {
            throw new IllegalArgumentException("The number of eggs can not be less than 0");
        }
        this.numberEggs = numberEggs;
    }

    /**
     * NumberFormatException is a subclass of IllegalArgumentException and too is a Runtime Exception exception
     */
    public void exampleNumberFormatException() throws NumberFormatException {
        try {
            System.out.println(Integer.parseInt("abs"));
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error in the cast of the String object");
        }
    }


}
