package com.anagrams.verifier.service.application.response;

public class CheckAnagramResponse {

  private boolean anagram;

  public CheckAnagramResponse(final boolean anagram) {
    this.anagram = anagram;
  }

  public boolean isAnagram() {
    return anagram;
  }

}
