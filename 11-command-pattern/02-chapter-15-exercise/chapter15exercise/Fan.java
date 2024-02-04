/*
 *  Java Design Pattern Essentials - Second Edition, by Tony Bevis
 *  Copyright 2012, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */
package chapter15exercise;

public class Fan {
    public static final int MIN_SPEED = 0;
    public static final int MAX_SPEED = 3;
    public static final int DEFAULT_SPEED = 1;
    
    private int speed;
    
    public Fan() {
        speed = DEFAULT_SPEED;
        System.out.println("Fan: speed is " + 
                                    getSpeed());
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        if (speed < MIN_SPEED || speed > MAX_SPEED) {
            throw new IllegalArgumentException("invalid speed");
        }
        
        this.speed = speed;
        System.out.println("Fan: speed is " + 
                                    getSpeed());
        
    }
    
    public void speedUp() {
            if (getSpeed() < MAX_SPEED) {
                speed++;
                System.out.println("Fan: speed turned up to level " + 
                                    getSpeed());
            }
    }
    
    public void speedDown() {
            if (getSpeed() > MIN_SPEED) {
                speed--;
                System.out.println("Fan: speed turned down to level " + 
                                    getSpeed());
            }
    }

}
