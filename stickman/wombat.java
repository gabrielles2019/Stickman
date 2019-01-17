import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wombat extends Actor {
    public void act() 
    {
        move(4);
        if (isAtEdge()) {
            setLocation(25,375);
        }
    }    
}
