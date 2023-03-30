package com.anagrams.verifier.service.application.command;

public class CheckAnagramCommand {

  private String firstText;
  private String secondText;

  public CheckAnagramCommand(final String firstText, final String secondText) {
    this.firstText = normalize(firstText);
    this.secondText = normalize(secondText);
  }

  public String getFirstText() {
    return firstText;
  }

  public String getSecondText() {
    return secondText;
  }

  private static String normalize(final String text) {
    return text.replaceAll("[^a-zA-Z]", "").toLowerCase();
  }

}
