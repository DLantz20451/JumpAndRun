import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Actor
{
    GifImage myGif = new GifImage("Finale.gif");
    
    private SimpleTimer timer = new SimpleTimer();
    
    /**
     * Act - do whatever the End wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        cutscene();
    }
    
    /**
     * our cutscene
     */
    public void cutscene()
    {
        if (timer.millisElapsed() >= 6000)
        {
            Greenfoot.stop();
        }
    }
}
