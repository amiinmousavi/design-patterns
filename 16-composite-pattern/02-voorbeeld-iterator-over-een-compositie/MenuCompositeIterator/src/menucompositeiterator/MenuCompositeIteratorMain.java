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
public class MenuCompositeIteratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialisering
        Waitress waitress = new Waitress(createMenu());
        
        // print volledig menu - iteratie intern in menu
        waitress.printMenu();
        
        // print vegetarisch menu - zelf itereren
        Iterator iterator = waitress.getFullMenu().compositeIterator();
        System.out.println();
        System.out.println("Vegatarisch menu");
        System.out.println("================");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            if (menuComponent.isVegetarianItem()) {
                menuComponent.print();
            }
        }        
        
    }

    private static MenuComponent createMenu() {
        MenuComponent dinerMenu = new Menu("Restaurantmenu", "Lunch");
        MenuComponent cafeMenu = new Menu("Bistromenu", "Snack");
        MenuComponent dessertMenu = new Menu("Dessertmenu", "Nagerechten");
        MenuComponent allMenus = new Menu("Menu", "Alles wat de keuken maakt");
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem(
                "Steak bearnaise",
                "Steak van Westvlaams rood, 250g, met bearnaisesaus, frieten en slaatje",
                false,
                28.99));
        dinerMenu.add(new MenuItem(
                "Zeetong meuniere",
                "Tong in boter gebakken, met frieten en slaatje",
                false,
                38.99));
        dinerMenu.add(new MenuItem(
                "Gevulde aubergine",
                "Aubergine met groentevulling, in de oven gebakken, met brood",
                true,
                18.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Dame blanche",
                "vanilleijs met warme chocoladesaus en slagroom",
                true,
                6.99));
        dessertMenu.add(new MenuItem(
                "Appel",
                "een echte appel, in de schil",
                true,
                2.99));
        cafeMenu.add(new MenuItem(
                "Spaghetti",
                "spaghetti bolognaise met kaas",
                false,
                12.99));
        cafeMenu.add(new MenuItem(
                "Croque",
            "croque monsieur",
            false,
            12.99));
        return allMenus;
    }
    
}
