package com.anagrams.verifier.service.application.use_case;

import com.anagrams.verifier.service.application.command.CheckAnagramCommand;
import com.anagrams.verifier.service.application.response.CheckAnagramResponse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CheckAnagramUseCaseTest {

  @Test
  public void should_return_true_when_two_texts_are_anagrams() {
    final String firstText = "Eleven plus two";
    final String secondText = "Twelve plus one";

    final CheckAnagramResponse response = new CheckAnagramUseCase().execute(new CheckAnagramCommand(firstText, secondText));

    Assertions.assertTrue(response.isAnagram());
  }

  @Test
  public void should_return_false_when_two_texts_are_not_anagrams() {
    final String firstText = "Eleven plus two";
    final String secondText = "Twelve plus three";

    final CheckAnagramResponse response = new CheckAnagramUseCase().execute(new CheckAnagramCommand(firstText, secondText));

    Assertions.assertFalse(response.isAnagram());
  }
}
