/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15exercise;

public class NullCommand implements Command {
    
    public NullCommand() {
    }

    @Override
    public void execute() {
        // hier gebeurt met opzet niets.
        // println enkel voor debugging.
        System.out.println("Null command executing.");
    }

    @Override
    public void undo() {
        // hier gebeurt met opzet niets.
        // println enkel voor debugging.
        System.out.println("Null command undoing.");
    }
    
}
