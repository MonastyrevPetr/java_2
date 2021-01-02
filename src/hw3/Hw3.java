package hw3;


import java.util.HashMap;
import java.util.Map;

public class Hw3 {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            Integer val = map.getOrDefault(strings[i], 0);
            map.put(strings[i], val + 1);
        }
        System.out.println(map);

        Telephone telephone = new Telephone();
        telephone.add("Ivanov", "1");
        telephone.add("Ivanov", "2");
        telephone.add("Petrov", "3");
        telephone.add("Petrov", "4");
        telephone.add("Sidorov", "5");
        telephone.add("Sidorov", "6");
        telephone.add("Kozlov", "7");
        telephone.add("Kozlov", "8");

        System.out.println(telephone.get("Petrov"));
    }
}
