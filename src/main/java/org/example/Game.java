package org.example;

public interface Game {
    void start();
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
