package com.example.judur;

import java.io.Serializable;

public class food implements Serializable {

    private String name;
    private int image;
    private String ingredients;
    private String recipe;
    private String link;
    private String linkG;

    public food(String name, int image, String ingredients, String recipe, String link, String linkG) {
        this.name = name;
        this.image = image;
        this.ingredients = ingredients;
        this.recipe = recipe;
        this.link = link;
        this.linkG = linkG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLinkG() {
        return linkG;
    }

    public void setLinkG(String linkG) {
        this.linkG = linkG;
    }
}