package org.example;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}

