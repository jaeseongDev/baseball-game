package controller;

import model.Numbers;
import model.RandomNumbersGenerator;
import model.RestartOrExitNumber;
import model.StrikeAndBallCounter;
import view.View;

public class BaseballGameController {

  private View view;
  private RandomNumbersGenerator randomNumbersGenerator;
  public BaseballGameController() {
    this.view = new View();
    this.randomNumbersGenerator = new RandomNumbersGenerator();
  }

  public void startGame() {
    view.printPlayGame();
    playOneGame();

    String input = view.inputRestartOrExitGame();
    RestartOrExitNumber restartOrExitNumber = new RestartOrExitNumber(input);

    if (restartOrExitNumber.isRestart()) {
      startGame();
    }
  }

  private void playOneGame() {
    Numbers answerNumbers = randomNumbersGenerator.generate();
    System.out.println("answerNumbers : " + answerNumbers);
    while (true) {
      Numbers inputNumbers = new Numbers(view.inputNumbers());
      StrikeAndBallCounter strikeAndBallCounter = new StrikeAndBallCounter(inputNumbers, answerNumbers);
      int strikeCount = strikeAndBallCounter.countStrike();
      int ballCount = strikeAndBallCounter.countBall();
      view.printResult(strikeCount, ballCount);

      if (strikeAndBallCounter.isCorrect()) {
        view.printCorrectAnswer();
        break;
      }
    }
  }
}
