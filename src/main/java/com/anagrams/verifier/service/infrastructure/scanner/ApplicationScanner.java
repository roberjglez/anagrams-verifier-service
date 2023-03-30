package com.anagrams.verifier.service.infrastructure.scanner;

import com.anagrams.verifier.service.application.command.CheckAnagramCommand;
import com.anagrams.verifier.service.application.response.CheckAnagramResponse;
import com.anagrams.verifier.service.application.use_case.CheckAnagramUseCase;
import java.util.Scanner;

public class ApplicationScanner {

  public static void main(String[] args) {

    final CheckAnagramUseCase checkAnagramUseCase = new CheckAnagramUseCase();
    System.out.println("Welcome! This is a service to check if two texts are anagrams.");

    while (true) {
      System.out.println("Please, type your first text and press Enter");
      final String firstText = readFromScanner();

      System.out.println("Type now your second text and press Enter");
      final String secondText = readFromScanner();

      final CheckAnagramResponse response = checkAnagramUseCase.execute(new CheckAnagramCommand(firstText, secondText));

      if (response.isAnagram()) {
        System.out.println("The texts are anagrams!");
      } else {
        System.out.println("The texts are not anagrams.");
      }
    }
  }

  private static String readFromScanner() {
    return new Scanner(System.in).nextLine();
  }

}
