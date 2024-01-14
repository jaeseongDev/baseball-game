package model;

public class StrikeAndBallCounter {

  public static final int CORRECT_ANSWER_STRIKE_COUNT = 3;
  private Numbers inputNumbers;
  private Numbers answerNumbers;

  public StrikeAndBallCounter(Numbers inputNumbers, Numbers answerNumbers) {
    this.inputNumbers = inputNumbers;
    this.answerNumbers = answerNumbers;
  }

  public int countBall() {
    int ball = 0;
    for (int i = 0; i < Numbers.VALID_NUMBERS_LENGTH; i++) {
      if (inputNumbers.contains(answerNumbers.get(i))) {
        ball++;
      }
    }
    return ball - countStrike();
  }

  public int countStrike() {
    int strike = 0;
    for (int i = 0; i < Numbers.VALID_NUMBERS_LENGTH; i++) {
      if (inputNumbers.get(i).equals(answerNumbers.get(i))) {
        strike++;
      }
    }
    return strike;
  }

  public boolean isCorrect() {
    return this.countStrike() == CORRECT_ANSWER_STRIKE_COUNT;
  }
}
