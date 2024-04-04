/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.generics;

/**
 *
 * @author nestormoreno
 */
public class RawTypes {
    
    public class Box<T> {
        public void set(T t) {
            Box<Integer> intBox = new Box<>();
            //this is a raw type because the argument is not given and the class 
            // has a type argument
            //avoid the use of raw types because can generate warnings and by pass
            // the generic type checking
            Box rawBox = new Box();
            
            //This expression generates a warning
            Box<Integer> intBox2 = rawBox;
        }
    }
    
    /**
     * This code can generate a The term "unchecked" means that the compiler 
     * does not have enough type information to perform all type checks
     * necessary to ensure type safety. The "unchecked" warning is disabled,
     * by default, though the compiler gives a hint. To see all "unchecked" 
     * warnings, recompile with -Xlint:unchecked.
     */
    public class WarningDemo {
        public void main(String[] args) {
            Box<Integer> bi;
            bi = createBox();
        }
        
        public Box createBox() {
            return new Box();
        }
    }
    
}
