/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucompositeiterator;

import java.util.Iterator;

/**
 *
 * @author Pieter.Lust
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    
    
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public boolean isVegetarianItem() {
        return vegetarian;
    }

    @Override
    Iterator compositeIterator() {
        return new NullIterator();
    }
    
    @Override
    Iterator childrenIterator() {
        return new NullIterator();
    }

    
    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarianItem()) {
            System.out.print(" (veg)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
    
}
