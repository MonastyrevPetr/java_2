package hw3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Telephone {
    private Map<String, LinkedList<String>> map = new HashMap<>();

    public void add(String surname, String number) {
        LinkedList<String> num = map.getOrDefault(surname, new LinkedList<>());
        num.add(number);
        map.put(surname, num);

    }

    public LinkedList<String> get(String surname) {
        return map.get(surname);
    }

}
