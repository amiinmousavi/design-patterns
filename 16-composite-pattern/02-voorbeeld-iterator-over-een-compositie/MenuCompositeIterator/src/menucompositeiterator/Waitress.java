/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucompositeiterator;

/**
 *
 * @author Pieter.Lust
 */
public class Waitress {
    MenuComponent fullMenu;

    public MenuComponent getFullMenu() {
        return fullMenu;
    }

    public void setFullMenu(MenuComponent fullMenu) {
        this.fullMenu = fullMenu;
    }

    public Waitress(MenuComponent fullMenu) {
        this.fullMenu = fullMenu;
    }
    
    // Iteratie over het volledige menu
    // De iteratie wordt gedaan door de composite
    public void printMenu() {
        fullMenu.print();
    }
}
