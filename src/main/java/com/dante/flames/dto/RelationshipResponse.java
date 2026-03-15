package com.dante.flames.dto;

public class RelationshipResponse {

    private final String result;
    private final String verse;

    public RelationshipResponse(String result, String verse) {
        this.result = result;
        this.verse = verse;
    }

    public String getResult() {
        return result;
    }

    public String getVerse() {
        return verse;
    }
}
