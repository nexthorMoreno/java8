package co.com.books.effectivejava.chapters.two;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AvoidUnnecessaryObjects {
  private final Date birthDate = null;
  // Other fields, methods, and constructor omitted
  /**
   * The starting and ending dates of the baby boom.
   */
  private static final Date BOOM_START;
  private static final Date BOOM_END;
  static {
    Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
    BOOM_START = gmtCal.getTime();
    gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
    BOOM_END = gmtCal.getTime();
  }

  public boolean isBabyBoomer() {
    return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
  }

  public static void main(String args[]) {
    AvoidUnnecessaryObjects a = new AvoidUnnecessaryObjects();
    System.out.println(a.isBabyBoomer());
  }

}
