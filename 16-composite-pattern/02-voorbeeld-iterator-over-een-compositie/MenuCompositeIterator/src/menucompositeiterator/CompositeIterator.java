/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menucompositeiterator;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Pieter.Lust
 */
public class CompositeIterator implements Iterator {
    Stack<Iterator> iteratorStack = new Stack();

    public CompositeIterator(Iterator iterator) {
        iteratorStack.push(iterator);
    }
    
    @Override
    public boolean hasNext() {
        if (iteratorStack.empty()) {
            return false;
        }
        else {
            Iterator iterator = iteratorStack.peek();
            if (!iterator.hasNext()) {
                iteratorStack.pop();
                return hasNext();
            }
            else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = iteratorStack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            iteratorStack.push(component.childrenIterator());
            return component;
        }
        else {
            return null;
        }
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("No removal on composite iterator"); 
    }
    
}
