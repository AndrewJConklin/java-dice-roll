public class DiceRoller {
  public static void main(String[] args) {
    Dice firstDie = new Dice();
    Dice secondDie = new Dice();

    int twos = 0;
    int fours = 0;
    int sixes = 0;
    int sevens = 0;

    for (int i = 0; i < 101; i++) {
      int firstDieRoll = firstDie.roll();
      int secondDieRoll = secondDie.roll();
      int total = firstDieRoll + secondDieRoll;

      if (total == 2) {
        twos = twos + 1;
      } else if (total == 4) {
        fours = fours + 1;
      } else if (total == 6) {
        sixes = sixes + 1;
      } else if (total == 7) {
        sevens = sevens + 1;
      }
    }

    String twoStatement = String.format("Two was rolled %d times!", twos);
    System.out.println(twoStatement);

    String fourStatement = String.format("Four was rolled %d times!", fours);
    System.out.println(fourStatement);

    String sixStatement = String.format("Six was rolled %d times!", sixes);
    System.out.println(sixStatement);

    String sevenStatement = String.format("Seven was rolled %d times!", sevens);
    System.out.println(sevenStatement);
  }
}