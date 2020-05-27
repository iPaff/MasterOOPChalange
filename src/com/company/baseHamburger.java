package com.company;

import org.w3c.dom.ls.LSOutput;

public class baseHamburger {
    private String name;
    private String breadType;
    private String meat;
    private String carrot;
    private String tomato;
    private String lettuce;
    private String cucumber;
    private double hamburgerPrice;
    private double carrotPrice;
    private double tomatoPrice;
    private double lettucePrice;
    private double cucumberPrice;
    private double totalPrice;



    public baseHamburger(String name, String breadType, String meat, double hamburgerPrice) {
        this.name = name;
        this.breadType = breadType;
        this.meat = meat;
        this.hamburgerPrice = hamburgerPrice;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeat() {
        return meat;
    }

    public double getHamburgerPrice() {
        return hamburgerPrice;
    }

    public void addCarrot(String carrot,double price){
        this.carrot = carrot;
        this.carrotPrice = price;
        System.out.println("Added " + carrot + " for an extra " + carrotPrice);
    }
    public void addTomato(String tomato,double price){
        this.tomato = tomato;
        this.tomatoPrice = price;
        System.out.println("Added " + tomato + " for an extra " + tomatoPrice);
    }
    public void addLettuce(String lettuce,double price){
        this.lettuce = lettuce;
        this.lettucePrice = price;
        System.out.println("Added " + lettuce + " for an extra " + lettucePrice);
    }
    public void addCucumber(String cucumber,double price){
        this.cucumber = cucumber;
        this.cucumberPrice = price;
        System.out.println("Added " + cucumber + " for an extra " + cucumberPrice);
    }
    public double calculatePrice(){
        System.out.println(this.name + " with " + this.breadType + " with " + this.meat + "for $" + hamburgerPrice);
        if (carrot != null){
            totalPrice = hamburgerPrice + carrotPrice;
        }
        if (tomato != null){
            totalPrice = hamburgerPrice + carrotPrice + tomatoPrice;
        }
        if (lettuce != null){
            totalPrice = hamburgerPrice + carrotPrice + tomatoPrice + lettucePrice;
        }
        if (cucumber != null){
            totalPrice = hamburgerPrice + carrotPrice + tomatoPrice + lettucePrice + cucumberPrice;
        } return totalPrice;
    }
}
