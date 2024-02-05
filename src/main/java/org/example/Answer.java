package org.example;

public class Answer {
    private Integer countTry;
    private Integer countBull;
    private Integer countCow;

    @Override
    public String toString() {
        return String.format("Вывод: %d коровы %d быка, номер попытки: %d", countCow, countBull, countTry);
    }

    public Answer(Integer countTry, Integer countBull, Integer countCow) {
        this.countTry = countTry;
        this.countBull = countBull;
        this.countCow = countCow;
    }
}
