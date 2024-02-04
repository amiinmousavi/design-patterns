/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15exercise;

public class Client {
    
    public static void main(String[] args) {
        // Create a radio and its up/down command objects
        Radio radio = new Radio();
        radio.on();
        Command volumeUpCommand = new VolumeUpCommand(radio);
        Command volumeDownCommand = new VolumeDownCommand(radio);
        
        // Create an electric window and its up/down command objects
        ElectricWindow window = new ElectricWindow();
        Command windowUpCommand = new WindowUpCommand(window);
        Command windowDownCommand = new WindowDownCommand(window);
        
        // Een fan-object met bijhorende commando's maken
        Fan fan = new Fan();
        Command fanUpCommand = new FanSpeedUpCommand(fan);
        Command fanDownCommand = new FanSpeedDownCommand(fan);
        
        // Create a speech recogniser object
        SpeechRecogniser speechRecogniser = new SpeechRecogniser();
        
        // Testen dat de speech recogniser ook werkt vooraleer setCommands
        //  aangeroepen is.
        System.out.println("Speech recognition controlling nothing");
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearDownSpoken();
        
        
        speechRecogniser.setCommands(volumeUpCommand, volumeDownCommand);
        System.out.println("Speech recognition controlling the radio");
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearDownSpoken();
        
        speechRecogniser.setCommands(windowUpCommand, windowDownCommand);
        System.out.println("Speech recognition will now control the window");
        speechRecogniser.hearDownSpoken();
        speechRecogniser.hearUpSpoken();
        
        speechRecogniser.setCommands(fanUpCommand, fanDownCommand);
        System.out.println("Speech recognition will now control the fan");
        speechRecogniser.hearDownSpoken();
        speechRecogniser.hearDownSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUpSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
        speechRecogniser.hearUndoSpoken();
    }
    
}
