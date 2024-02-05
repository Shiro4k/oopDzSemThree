package org.example;

public enum GameStatus {
    INIT, START, LOSE("You Lose"), WIN("You Win");

    private String description;

    GameStatus(String description) {
        this.description = description;
    }
    GameStatus() {
    }

    public String getDescription() {
        return description;
    }
}
