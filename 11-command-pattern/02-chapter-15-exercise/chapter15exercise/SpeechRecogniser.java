/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15exercise;

import java.util.ArrayDeque;

public class SpeechRecogniser {
    
    private Command upCommand, downCommand;
    
    private ArrayDeque<Command> undoStack = new ArrayDeque<Command>();

    public SpeechRecogniser() {
        this.upCommand = new NullCommand();
        this.downCommand = new NullCommand();
    }
    

    public void setCommands(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;

        // forget past commands
        undoStack.clear();
    }
    
    
    public void hearUpSpoken() {
        undoStack.push(upCommand);
        upCommand.execute();
    }
    
    public void hearDownSpoken() {
        undoStack.push(downCommand);
        downCommand.execute();
    }
    
 
    public void hearUndoSpoken() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
        }
        else {
            System.out.println("Nothing to undo.");
        }
    }
}
