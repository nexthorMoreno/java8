package co.com.books.effectivejava.chapters.two;

/**
 * Noninstantiable utility class the private constructor guarantee the immutability of this class
 * the exception is a good practice to advice of the immutability of this class
 * 
 * @author nestormoreno
 *
 */
public class ImmutableUtilityClass {

  private ImmutableUtilityClass() throws AssetionError {
    throw new AssetionError();
  }
  // TODO Auto-generated constructor stub
}


class AssetionError extends Throwable {

  public void AssetionError() {}

}
