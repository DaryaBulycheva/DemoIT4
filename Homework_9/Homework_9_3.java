package Homework_9;

import java.util.Map;
import java.util.TreeMap;

public class Homework_9_3 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> resultMap = new TreeMap<>();
        for (String s : strings) {
            if (resultMap.containsKey(s)) {
                resultMap.put(s, true);
            } else {
                resultMap.put(s, false);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[]{"c", "b", "a"}));
        System.out.println(wordMultiple(new String[]{"c", "c", "c", "c"}));
    }
}
