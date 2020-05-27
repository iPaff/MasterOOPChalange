package com.company;

public class HealthyBurger extends baseHamburger {
    private String cheese;
    private double cheesePrice;
    private String avocado;
    private double avocadoPrice;

    public HealthyBurger(String name, String breadType, String meat, double hamburgerPrice, String cheese, double cheesePrice, String avocado, double avocadoPrice) {
        super(name, breadType, meat, hamburgerPrice);
        this.cheese = cheese;
        this.cheesePrice = cheesePrice;
        this.avocado = avocado;
        this.avocadoPrice = avocadoPrice;
    }

    public void addCheese(String cheese, double price){
        this.cheese = cheese;
        this.cheesePrice = price;
        System.out.println("Added " + cheese + "for an extra $ " + cheesePrice);
    }
    public void addAvocado(String avocado, double price){
        this.avocado = avocado;
        this.avocadoPrice = price;
        System.out.println("Added " + avocado + "for an extra $ " + avocadoPrice);
    }
    @Override
    public double calculatePrice(){
        double healthyBurgerPrice = super.calculatePrice();
        if (cheese != null){
            healthyBurgerPrice = healthyBurgerPrice + this.cheesePrice;
        }
        if (avocado != null){
            healthyBurgerPrice = healthyBurgerPrice + this.avocadoPrice;
        }
        return healthyBurgerPrice;
    }
    public String getCheese() {
        return cheese;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public String getAvocado() {
        return avocado;
    }

    public double getAvocadoPrice() {
        return avocadoPrice;
    }

}
