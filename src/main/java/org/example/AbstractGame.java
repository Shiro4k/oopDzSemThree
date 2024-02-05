package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class AbstractGame implements Game {
    private String word;
    private GameStatus status = GameStatus.INIT;
    private Integer maxTry;

    public String generateWord(Integer size) {
        StringBuilder word = new StringBuilder();
        List<String> charList = generateCharList();
        Random random = new Random();
        HashSet<String> uniqueChars = new HashSet<>();

        while (uniqueChars.size() < size) {
            int randomIndex = random.nextInt(charList.size());
            String randomChar = charList.get(randomIndex);
            uniqueChars.add(randomChar);
        }

        for (String charValue : uniqueChars) {
            word.append(charValue);
        }

        return word.toString();
    }


    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введити длину слова: ");
        Integer sizeWord = Integer.valueOf(scanner.nextLine());
        System.out.print("Введити число попыток: ");
        Integer maxTry = Integer.valueOf(scanner.nextLine());
        this.word = generateWord(sizeWord);
        this.status = GameStatus.START;
        this.maxTry = maxTry;

    }

    @Override
    public Answer inputValue(String value) {
        if(!getGameStatus().equals(GameStatus.START)) throw new RuntimeException("Game is not started");
        Integer countCow = 0;
        Integer countBull = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == value.charAt(i)) countBull++;
            if (word.contains(String.valueOf(value.charAt(i)))) countCow++;
        }

        --maxTry;

        if(countBull  == word.length()) { 
            status = GameStatus.WIN;
        }
        else if  (maxTry == 0) {
             status = GameStatus.LOSE;
        }

        return new Answer(maxTry,countBull,countCow);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    public abstract List<String> generateCharList();
}
