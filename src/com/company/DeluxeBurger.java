package com.company;

public class DeluxeBurger extends baseHamburger {
    private String chips;
    private String cola;
    private double deluxePrice;



    public DeluxeBurger(String name, String breadType, String meat, double hamburgerPrice, String chips, String cola, double deluxePrice) {
        super(name, breadType, meat, hamburgerPrice);
        this.chips = chips;
        this.cola = cola;
        this.deluxePrice = deluxePrice;
//        super.addCarrot("Carrot", 0.5);
//        super.addCucumber("Cucumber", 0.7);
//        super.addLettuce("Lettuce",0.3);
//        super.addTomato("Tomato", 0.8);
    }


    public void addCarrot(){
        System.out.println("Cannot add Carrot to Deluxe Burger");
    }
    public void addTomato(){
        System.out.println("Cannot add Tomato to Deluxe Burger");
    }
    public void addCucumber(){
        System.out.println("Cannot add Cucumber to Deluxe Burger");
    }
    public void addLettuce(){
        System.out.println("Cannot add Lettuce to Deluxe Burger");
    }
    public double calculatePrice(){
       return deluxePrice = deluxePrice + super.calculatePrice();
    }
}
