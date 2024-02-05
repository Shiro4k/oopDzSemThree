package org.example;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'а'; i <= 'я'; i++) {
            result.add(String.valueOf(i));
        }
        result.add("ё");
        return result;
    }

}
