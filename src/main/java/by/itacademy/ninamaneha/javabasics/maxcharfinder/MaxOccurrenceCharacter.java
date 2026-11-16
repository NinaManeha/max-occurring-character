package by.itacademy.ninamaneha.javabasics.maxcharfinder;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceCharacter {
    public static void main(String[] args) {
        String str = "It is a long established fact";

        Map<Character, Integer> charCounts = new HashMap<>();
        char maxChar = Character.toLowerCase(str.charAt(0));
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == ' ') {
                continue;
            }

            int currentCount = charCounts.getOrDefault(ch, 0) + 1;
            charCounts.put(ch, currentCount);

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = ch;
            }
        }
        System.out.println("Самый частый символ: '" + maxChar + "' (встречается " + maxCount + " раз)");
    }
}
