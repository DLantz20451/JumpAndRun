import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstacles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstacles extends Actor
{
    /**
     * Act - do whatever the obstacles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        damage();
    }
    
    /**
     * Damage 
     */
    public void damage()
    {
        Actor barrels = getOneIntersectingObject(Auridine.class);
        if ( barrels != null)
        {
           
        }
        Actor bullets = getOneIntersectingObject(Auridine.class);
        if ( bullets != null)
        {
            
        }
        Actor spikes = getOneIntersectingObject(Auridine.class);
        if ( spikes != null)
        {
           
        }
    }
}

