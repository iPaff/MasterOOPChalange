package com.company;

public class Main {

    public static void main(String[] args) {

        baseHamburger Hamburger = new baseHamburger("hamburger","white","beef",10);
        Hamburger.addCarrot("Carrot",0.5);
        Hamburger.addCucumber("Cucumber", 0.3);
        System.out.println(Hamburger.calculatePrice());
        System.out.println("*******************");
        DeluxeBurger Deluxe = new DeluxeBurger("Deluxe","brown","chicken",10,"chips","cola",15);
        Deluxe.addCarrot();
        Deluxe.addCucumber();
        System.out.println(Deluxe.calculatePrice());
        System.out.println("*******************");
        HealthyBurger HealtyBurger = new HealthyBurger("HealtyBurger","brown","no meet",20,"cheese",0.5,"avocado",0.8);
        HealtyBurger.addAvocado("avocado",0.7);
        System.out.println(HealtyBurger.calculatePrice());
        System.out.println(Hamburger.calculatePrice());
    }
}
