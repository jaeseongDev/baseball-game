package model;

import java.util.Objects;

public class Number {

  public static final int MIN_NUMBER = 1;
  public static final int MAX_VALUE = 9;

  private int value;

  public Number(String value) {
    try {
      int number = Integer.parseInt(value);
      this.validate(number);
      this.value = number;
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("숫자만 입력해주세요.");
    }
  }

  public Number(int value) {
    this.validate(value);
    this.value = value;
  }

  private void validate(int value) {
    if (value < MIN_NUMBER || value > MAX_VALUE) {
      throw new IllegalArgumentException("1~9 사이의 숫자를 입력해주세요.");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Number number = (Number) o;
    return value == number.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}
