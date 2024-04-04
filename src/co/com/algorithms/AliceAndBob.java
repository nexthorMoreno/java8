package co.com.algorithms;

public class AliceAndBob {

  String aliceScore;
  String bobScore;
  static int alicePoints;
  static int bobPoints;

  public AliceAndBob() {
    this.aliceScore = "10 15 18";
    this.bobScore = "4 40 18";
  }

  public static void main(String args[]) {
    AliceAndBob ab = new AliceAndBob();
    processScore(ab.aliceScore, ab.bobScore);
    System.out.println(alicePoints + " " + bobPoints);
  }

  public static String[] getScore(String score) {
    return score.split(" ");
  }

  public static void processScore(String aliceScore, String bobScore) {
    String[] alicePart = getScore(aliceScore);
    String[] bobPart = getScore(bobScore);
    for (int i = 0; i < alicePart.length; i++) {
      if (Integer.parseInt(alicePart[i]) > Integer.parseInt(bobPart[i])) {
        alicePoints++;
      }

      if (Integer.parseInt(alicePart[i]) < Integer.parseInt(bobPart[i])) {
        bobPoints++;
      }

    }
  }

}
