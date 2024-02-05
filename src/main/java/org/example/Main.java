package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question;
        do {
            List<Answer> log = new ArrayList<>();
            List<String> logScanner = new ArrayList<>();
            AbstractGame nGame = new NumGame();

            nGame.start();
            while (nGame.getGameStatus().equals(GameStatus.START)) {
                System.out.print("Ваш ход: ");
                String value = scanner.nextLine();

                Answer answer = nGame.inputValue(value);
                logScanner.add(value);
                log.add(answer);
                System.out.println(answer);
            }
            System.out.println(nGame.getGameStatus().getDescription());
            System.out.println("Вывести историю игры: Yes or No");
            question = scanner.nextLine();
            if (question.equalsIgnoreCase("Yes")) {
                for (int i = 0; i < logScanner.size(); i++) {
                    System.out.println(logScanner.get(i) + " - " + log.get(i));
                }
            }
            System.out.println("Перезапустить игру: Yes or No");
            question = scanner.nextLine();
        } while (question.equalsIgnoreCase("Yes"));

        System.out.println("Игра завершена. Спасибо за игру!");
    }
}