import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Floor floor = new Floor();
        addObject(floor,309,790);

        Auridine auridine = new Auridine();
        addObject(auridine,18,749);

        bullets bullets = new bullets();
        addObject(bullets,595,657);
        bullets bullets2 = new bullets();
        addObject(bullets2,595,425);
        bullets bullets3 = new bullets();
        addObject(bullets3,595,94);

        LetsGo letsGo = new LetsGo();
        addObject(letsGo,557,744);

        small small = new small();
        addObject(small,86,730);
        small small2 = new small();
        addObject(small2,116,650);
        small small3 = new small();
        addObject(small3,148,580);
        
        spikes spikes = new spikes();
        addObject(spikes,277,774);

        MusicPlayer musicPlayer = new MusicPlayer();
        addObject(musicPlayer,472,430);
    }
}
