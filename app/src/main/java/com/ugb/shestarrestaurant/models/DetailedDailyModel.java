package com.ugb.shestarrestaurant.models;

public class DetailedDailyModel {

    int image;
    String name;
    String descripcion;
    String rating;
    String price;
    String timing;

    public DetailedDailyModel(int image, String name, String descripcion, String rating,  String price, String timing ) {
        this.image = image;
        this.name = name;
        this.descripcion = descripcion;
        this.rating = rating;
        this.price = price;
        this.timing = timing;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}
