/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15exercise;

/**
 *
 * @author Pieter.Lust
 */
public abstract class UndoableFanCommand implements Command {
        
    protected Fan fan;
    protected int previousSpeed;
    
    public UndoableFanCommand(Fan fan) {
        this.fan = fan;
        this.previousSpeed = fan.getSpeed();
    }

    @Override
    public void undo() {
        fan.setSpeed(previousSpeed);
    }

}
