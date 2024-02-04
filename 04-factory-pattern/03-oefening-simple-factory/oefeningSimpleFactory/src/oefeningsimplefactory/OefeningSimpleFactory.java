/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningsimplefactory;

/**
 *
 *
 */
public class OefeningSimpleFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrankFactory drankfactory = new DrankFactory();
        Student student = new Student("Jan Janssens", drankfactory);

        student.DrinkCafeine();
        student.DrinkAlcohol();
    }

}
