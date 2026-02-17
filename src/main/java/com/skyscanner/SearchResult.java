package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {

    @JsonProperty("city")
    private String city;

    @JsonProperty("title")
    private String title;

    @JsonProperty("kind")
    private String kind;

    public SearchResult() {}

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }
    public void setKind(String kind) {
        this.kind = kind;
    }

}
