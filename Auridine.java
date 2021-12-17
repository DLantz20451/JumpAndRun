import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Auridine here.
 * 
 * @author (Dravin Lantz) 
 * @version (a version number or a date)
 */
public class Auridine extends Actor
{
    private int speed = 5;
    private int vSpeed = 0;
    
    private int accelaration = 1;
    private int jumpStreangth = 10; 

    private GreenfootImage Auridine1; 
    private GreenfootImage Auridine2;
    
    private SimpleTimer timer = new SimpleTimer();
    
    /**
     * How Auridine acts
     */
    public void act() 
    {
        checkKey();
        checkFall();
        hit();
        nextLevel();
        jumpFall();
    }
    
    /**
     * how we move
     */
    public void checkKey()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage("Spectral2.png");
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage("Spectral1.png");
        }
        
        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
        }
    }
    
    /**
     * how we move right
     */
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    
    /**
     * how we move left
     */
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }

    /**
     * how we fall
     */
    public void fall()
    {
        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed += accelaration;
    }
    
    /**
     * to help not phase through floor
     */
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        return under != null;
    }
    
    /**
     * how we detect the platform
     */
    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 + i, Platform.class);
            if (under!= null)
            {
                vSpeed = i;
                
            }
        }
    }
    
    /**
     * how we fall
     */
    public void checkFall()
    {
       if (onGround())
       {
           vSpeed = 0;  
       }
       else
       {
           fall();
       } 
    }
    
    /**
     * how we jump
     */
    public void jump()
    {
       vSpeed = -jumpStreangth;
       fall();
    }
    
    /**
     *what happends if we get hit
     */
    public void hit()
    {
        Actor bullets = getOneIntersectingObject(bullets.class);
        if (isTouching(bullets.class))
        {
            setLocation(17,764);
            Greenfoot.playSound("Default.wav");
        }
        
        Actor spikes = getOneIntersectingObject(spikes.class);
        if (isTouching(spikes.class))
        {
            setLocation(17,764);
            Greenfoot.playSound("Default.wav");
        }
        
        if (getY() >= 799 )
        {
            setLocation(17,764);
            Greenfoot.playSound("Default.wav");
        }
    }
    //Jake was here :)
    /**
     * next level
     * help from danpost
     * https://www.greenfoot.org/topics/1953
     */
    public void nextLevel()
    {
        Actor LetsGo = getOneIntersectingObject(LetsGo.class);
        if ( LetsGo != null)
        {
           Greenfoot.setWorld(new Zone1());
        }
        
        Actor nextWorld = getOneIntersectingObject(nextWorld.class);
        if ( nextWorld != null)
        {
           Greenfoot.setWorld(new Zone2());
        }
        
        Actor where = getOneIntersectingObject(where.class);
        if ( where != null)
        {
          Greenfoot.setWorld(new huh()); 
        }
        
        Actor FinalFate = getOneIntersectingObject(FinalFate.class);
        if ( FinalFate != null)
        {
          Greenfoot.setWorld(new Finale()); 
        }
    }
    
    /**
     * our grace time for jumping off of an edge
     */
    public void jumpFall()
    {
        if (timer.millisElapsed() >= 430 && onGround() == false)
        {
            if (Greenfoot.isKeyDown("space"))
            {
                jump();
                timer.mark();
            }
        }
    }
}