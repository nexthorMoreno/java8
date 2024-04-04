package co.com.chapter.six.exceptionhandling.review.item4;

/**
 * Created by nestor.moreno on 2017-02-20.
 */
public class ThrowExeption {

    public static void main(String[] args) {
        Object obj = new Integer(3);
        String str = (String) obj;  // String try to extend an Integer -> ClassCastException
        System.out.println(str);


    }
}
