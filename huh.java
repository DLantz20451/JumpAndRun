import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class huh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class huh extends World
{

    /**
     * Constructor for objects of class huh.
     * 
     */
    public huh()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Floor floor = new Floor();
        addObject(floor,305,390);
        
        Auridine auridine = new Auridine();
        addObject(auridine,15,368);
        
        REDACTED rEDACTED = new REDACTED();
        addObject(rEDACTED,541,350);
        rEDACTED.setLocation(543,358);
    }
}
