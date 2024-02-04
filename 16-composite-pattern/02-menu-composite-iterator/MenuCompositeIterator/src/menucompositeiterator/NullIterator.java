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
class NullIterator implements Iterator {

    public NullIterator() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
    
}
