import java.util.Random;

class Dice {
  public int roll() {
    int min = 1;
    int max = 6;

    int diceroll = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return diceroll;
  }
}