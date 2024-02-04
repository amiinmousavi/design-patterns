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
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();    
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarianItem() {
        throw new UnsupportedOperationException();
    }
    

    Iterator compositeIterator() {
        throw new UnsupportedOperationException();
    }
    Iterator childrenIterator() {
        throw new UnsupportedOperationException();
    }


    public void print() {
        throw new UnsupportedOperationException();
    }
}
