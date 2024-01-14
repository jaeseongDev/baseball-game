package model;

import static model.Numbers.VALID_NUMBERS_LENGTH;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbersGenerator {

  public Numbers generate() {
    List<Integer> randomNumbers = new ArrayList<>();
    while (randomNumbers.size() < VALID_NUMBERS_LENGTH) {
      int randomNumber = (int) (Math.random() * 9) + 1;
      if (!randomNumbers.contains(randomNumber)) {
        randomNumbers.add(randomNumber);
      }
    }
    return new Numbers(randomNumbers);
  }
}
