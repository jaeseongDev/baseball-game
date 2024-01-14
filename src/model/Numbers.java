package model;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

  public static final int VALID_NUMBERS_LENGTH = 3;

  private List<Number> numbersGroup;

  public Numbers(List<Integer> numbers) {
    List<Number> convertedNumbers = new ArrayList<>();
    for (int number : numbers) {
      Number convertedNumber = new Number(number);
      convertedNumbers.add(convertedNumber);
    }
    this.validate(convertedNumbers);
    this.numbersGroup = convertedNumbers;
  }

  public Numbers(String numbers) {
    List<Number> convertedNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.length(); i++) {
      String numberString = numbers.substring(i, i + 1);
      Number number = new Number(numberString);
      convertedNumbers.add(number);
    }
    this.validate(convertedNumbers);
    this.numbersGroup = convertedNumbers;

  }

  private void validate(List<Number> numbersGroup) {
    if (numbersGroup.size() != VALID_NUMBERS_LENGTH) {
      throw new IllegalArgumentException("3자리 숫자를 입력해주세요.");
    }
  }

  public Number get(int index) {
    return numbersGroup.get(index);
  }

  public boolean contains(Number number) {
    return numbersGroup.contains(number);
  }

  @Override
  public String toString() {
    return numbersGroup.get(0) + " " + numbersGroup.get(1) + " " + numbersGroup.get(2);
  }
}
