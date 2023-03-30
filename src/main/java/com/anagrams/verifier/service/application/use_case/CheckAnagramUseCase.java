package com.anagrams.verifier.service.application.use_case;

import com.anagrams.verifier.service.application.command.CheckAnagramCommand;
import com.anagrams.verifier.service.application.response.CheckAnagramResponse;
import java.util.Arrays;

public class CheckAnagramUseCase {

  public CheckAnagramResponse execute(final CheckAnagramCommand command) {
    final String firstText = command.getFirstText();
    final String secondText = command.getSecondText();

    if (firstText.length() != secondText.length()) {
      return new CheckAnagramResponse(false);
    }
    final char[] charArrayFirstText = firstText.toCharArray();
    final char[] charArraySecondText = secondText.toCharArray();
    Arrays.sort(charArrayFirstText);
    Arrays.sort(charArraySecondText);

    return new CheckAnagramResponse(Arrays.equals(charArrayFirstText, charArraySecondText));
  }
}
