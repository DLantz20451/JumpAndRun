import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullets extends obstacles
{
    GifImage myGif = new GifImage("bullet.gif");
    
    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        replace();
        setImage(myGif.getCurrentImage());
    }
    
    /**
     * movement
     */
    public void replace()
    {
        if (getX() == 0)
        {
            setLocation(592,Greenfoot.getRandomNumber(800));
        }
    }
    
}
