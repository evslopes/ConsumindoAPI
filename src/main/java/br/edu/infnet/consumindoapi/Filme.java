package br.edu.infnet.consumindoapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Filme {
    @JsonProperty
    private String Title;
    @JsonProperty
    private String Year;
    @JsonProperty
    private String Genre;
    @JsonProperty
    private String Awards;

    @Override
    public String toString() {
        return "Filme{" +
                "Title='" + Title + '\'' +
                ", Year='" + Year + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Awards='" + Awards + '\'' +
                '}';
    }
}
