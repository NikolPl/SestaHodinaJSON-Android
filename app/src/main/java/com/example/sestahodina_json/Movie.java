package com.example.sestahodina_json;

import com.google.gson.annotations.SerializedName;

public class Movie {

    // anotace, podle které to dokáže automaticky přiřadí - od gsonu - seralized name

    @SerializedName("name") // to znamená, že jsonu používáme name, kdybychom tam měli jméno - tak se přiřadí jméno do name
    public String name;
    @SerializedName("image")
    public String image;
    @SerializedName("description")
    public String description;
}
