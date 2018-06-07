package com.vernon.complexlist;

public class Items {
    private String name,email;
    private int amount,image;
    public Items(String name, String email, int amount, int image) {
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAmount() {
        return amount;
    }

    public int getImage() {
        return image;
    }
}
