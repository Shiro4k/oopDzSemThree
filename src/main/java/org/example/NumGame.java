package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}