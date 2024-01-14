package model;

public class RestartOrExitNumber {

  public static final int RESTART_NUMBER = 1;
  public static final int EXIT_NUMBER = 2;
  private int value;

  public RestartOrExitNumber(String value) {
    try {
      int number = Integer.parseInt(value);
      if (number != RESTART_NUMBER && number != EXIT_NUMBER) {
        throw new IllegalArgumentException("1 또는 2를 입력해주세요.");
      }
      this.value = number;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("숫자만 입력해주세요.");
    }
  }

  public boolean isRestart() {
    return value == RESTART_NUMBER;
  }
}
