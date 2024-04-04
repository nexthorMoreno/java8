package co.com.books.effectivejava.chapters.two;

/**
 *
 * Builder Pattern: use it to avoid the creation of multiple constructor when I have to lead with a
 * lot of optional parameters. The builder is a static member class of the class it builds The
 * Builder pattern simulates named optional parameters
 *
 * @author nestormoreno
 *
 */
public class NutritionFactsBuilderPattern {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // Required parameters
    private final int servingSize;
    private final int servings;

    // Optional parameters
    private int calories = 0;
    private int fat = 0;
    private int carbohydrate = 0;
    private int sodium = 0;

    /**
     * Constructor with the required fields as parameters
     *
     * @param servingSize
     * @param servings
     */
    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    /**
     * setters for the optional parameters that returns the instance of the current class
     *
     * @param calories
     * @return
     */
    public Builder calories(int calories) {
      this.calories = calories;
      return this;
    }

    public Builder fat(int fat) {
      this.fat = fat;
      return this;
    }

    public Builder carbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }

    public Builder sodium(int sodium) {
      this.sodium = sodium;
      return this;
    }

    /**
     *
     * @return
     */
    public NutritionFactsBuilderPattern build() {
      return new NutritionFactsBuilderPattern(this);
    }

  }

  /**
   * Constructor that get all the variables from the builder and assign the values to the local
   * instance variables
   *
   * @param builder
   */
  private NutritionFactsBuilderPattern(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }

  /**
   * Getters
   *
   * @return
   */
  public int getServingSize() {
    return servingSize;
  }

  public int getServings() {
    return servings;
  }

  public int getCalories() {
    return calories;
  }

  public int getFat() {
    return fat;
  }

  public int getSodium() {
    return sodium;
  }

  public int getCarbohydrate() {
    return carbohydrate;
  }

  /**
   * gets the builder object and set directly every attribute, not setted params mantains the
   * default value
   *
   * @param args
   */
  public static void main(String args[]) {
    NutritionFactsBuilderPattern n = new NutritionFactsBuilderPattern.Builder(240, 8).calories(10)
        .sodium(35)
        .carbohydrate(27)
        .build();
    System.out.println(n.getServings() + " " + n.getServingSize() + " " + n.getCalories() + " " + n.getCarbohydrate()
        + " " + n.getFat() + " " + n.getSodium());

  }

}
