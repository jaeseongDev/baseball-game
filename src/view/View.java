package view;

import java.util.Scanner;

public class View {
  private Scanner scanner;

  public View() {
    this.scanner = new Scanner(System.in);
  }

  public void printPlayGame() {
    System.out.println("숫자 야구 게임을 시작합니다.");
  }

  public String inputNumbers() {
    System.out.print("숫자를 입력해주세요 : ");
    String input = scanner.nextLine();
    return input;
  }

  public void printCorrectAnswer() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }

  public void printResult(int strikeCount, int ballCount) {
    if (strikeCount == 0 && ballCount == 0) {
      System.out.println("낫싱");
      return;
    }
    if (ballCount > 0) {
      System.out.print(ballCount + "볼 ");
    }
    if (strikeCount > 0) {
      System.out.print(strikeCount + "스트라이크");
    }
    System.out.println();
  }

  public String inputRestartOrExitGame() {
    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    String input = scanner.nextLine();
    return input;
  }
}
