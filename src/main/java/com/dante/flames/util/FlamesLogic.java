package com.dante.flames.util;

import java.util.ArrayList;
import java.util.List;

public class FlamesLogic {
    public static String calculateRelationship(
        String name1,
        String name2,
        String mode
    ) {
        name1 = name1.replaceAll("\\s+", "").toLowerCase();
        name2 = name2.replaceAll("\\s+", "").toLowerCase();

        StringBuilder sb1 = new StringBuilder(name1);
        StringBuilder sb2 = new StringBuilder(name2);

        for (int i = 0; i < sb1.length(); i++) {
            char ch = sb1.charAt(i);
            int index = sb2.indexOf(String.valueOf(ch));

            if (index != -1) {
                sb1.deleteCharAt(i);
                sb2.deleteCharAt(index);
                i--;
            }
        }

        int count = sb1.length() + sb2.length();

        if (count == 0) {
            return "Parallel";
        }

        List<Character> relation = new ArrayList<>();

        if (mode.equalsIgnoreCase("classic")) {
            relation.add('F');
            relation.add('L');
            relation.add('A');
            relation.add('M');
            relation.add('E');
            relation.add('S');
        } else if (mode.equalsIgnoreCase("genz")) {
            relation.add('V');
            relation.add('I');
            relation.add('B');
            relation.add('E');
            relation.add('R');
            relation.add('S');
        } else {
            return "Invalid Mode";
        }

        int index = 0;
        while (relation.size() > 1) {
            index = (index + count - 1) % relation.size();
            relation.remove(index);
        }

        return getRelation(relation.get(0), mode);
    }

    public static String getRelation(char ch, String mode) {
        if (mode.equalsIgnoreCase("classic")) {
            switch (ch) {
                case 'F' -> {
                    return "Friends";
                }
                case 'L' -> {
                    return "Lovers";
                }
                case 'A' -> {
                    return "Affection";
                }
                case 'M' -> {
                    return "Marriage";
                }
                case 'E' -> {
                    return "Enemies";
                }
                case 'S' -> {
                    return "Siblings";
                }
            }
        } else if (mode.equalsIgnoreCase("genz")) {
            switch (ch) {
                case 'V' -> {
                    return "Vibes";
                }
                case 'I' -> {
                    return "In Love";
                }
                case 'B' -> {
                    return "Besties";
                }
                case 'E' -> {
                    return "Ex Energy";
                }
                case 'R' -> {
                    return "Red Flag";
                }
                case 'S' -> {
                    return "Soulmate";
                }
            }
        }

        return "Unknown";
    }
}
