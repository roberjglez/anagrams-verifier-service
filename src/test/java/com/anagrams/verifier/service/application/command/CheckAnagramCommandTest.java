package com.anagrams.verifier.service.application.command;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CheckAnagramCommandTest {

  @Test
  public void should_clean_input() {

    // GIVEN
    final String firstText = "I’m a dot in place";
    final String secondText = "I am Lord Voldemort";

    // WHEN
    final CheckAnagramCommand command = new CheckAnagramCommand(firstText, secondText);

    // THEN
    Assertions.assertEquals("imadotinplace", command.getFirstText());
    Assertions.assertEquals("iamlordvoldemort", command.getSecondText());
  }

}
