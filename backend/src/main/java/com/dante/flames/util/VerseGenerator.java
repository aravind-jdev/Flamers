package com.dante.flames.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class VerseGenerator {

    private static final Map<String, List<String>> verses = new HashMap<>();
    private static final Random random = new Random();

    static {
        // Classic Mode Verses
        verses.put("Friends", Arrays.asList(
                "Built on laughter and late-night talks.",
                "Some bonds are better as friends.",
                "Chaos duo unlocked. Friendship arc begins."
        ));

        verses.put("Marriage", Arrays.asList(
                "Two souls destined to walk together.",
                "This story might end with wedding bells.",
                "Plot twist: forever starts here."
        ));

        verses.put("Love", Arrays.asList(
                "Butterflies detected.",
                "Hearts syncing in silent rhythm.",
                "This might just be the real deal."
        ));

        verses.put("Enemies", Arrays.asList(
                "Tension levels rising.",
                "Not every spark means romance.",
                "Careful… drama ahead."
        ));

        verses.put("Affection", Arrays.asList(
                "Soft feelings blooming quietly.",
                "Gentle warmth between two hearts.",
                "Something sweet is growing."
        ));

        verses.put("Siblings", Arrays.asList(
                "More teasing than romance.",
                "Protective chaos energy detected.",
                "Better as family than lovers."
        ));

        // Gen-Z Mode Verses
        verses.put("Vibes", Arrays.asList(
                "No labels. Just vibes.",
                "Energy matching perfectly.",
                "It’s giving effortless chemistry."
        ));

        verses.put("In Love", Arrays.asList(
                "This one hits different.",
                "Main character energy.",
                "Yeah… this is serious."
        ));

        verses.put("Besties", Arrays.asList(
                "Ride or die duo.",
                "Platonic soulmate unlocked.",
                "Zero romance. 100% loyalty."
        ));

        verses.put("Ex Energy", Arrays.asList(
                "History repeating?",
                "Careful. Old ghosts whisper.",
                "Toxic nostalgia alert."
        ));

        verses.put("Red Flag", Arrays.asList(
                "Proceed with caution.",
                "Something feels off.",
                "Love shouldn’t feel like a warning sign."
        ));

        verses.put("Soulmate", Arrays.asList(
                "Destiny just entered the chat.",
                "Some connections are written in stars.",
                "This one feels cosmic."
        ));
    }

    public static String getRandomVerse(String result) {
        List<String> resultVerses = verses.get(result);

        if (resultVerses == null || resultVerses.isEmpty()) {
            return "No verse available.";
        }

        return resultVerses.get(random.nextInt(resultVerses.size()));
    }
}
