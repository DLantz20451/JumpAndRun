import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicPlayer extends Actor
{
    
    /**
     * Act - do whatever the MusicPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //music();
    }
    
    /**
     * how our music will be selected and played
     */
    public void music()
    {
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.playSound("bb.mp3");
        }
    }
}
