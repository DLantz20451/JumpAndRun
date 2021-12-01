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
    private int jumpStreangth = 12; 
    
    private int HP = 3;
    private int LIVES = 3;
    
    private GreenfootImage Auridine1; 
    private GreenfootImage Auridine2;
    private GreenfootImage Jump;
    
    
    /**
     * How Auridine acts
     */
    public void act() 
    {
        checkKey();
        checkFall();
        healthLoss();
        nextLevel();
        //Swing();
    }
    
    /**
     * how we move
     */
    public void checkKey()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage("Auridine2.png");
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage("Auridine1.png");
        }
        
        if (Greenfoot.isKeyDown("space") && onGround())
        {
            jump();
            setImage("Jump.png");
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
    
    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++)
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
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
     * hp and lives loss
     */
    public void healthLoss()
    {
        if (HP  <= 0)
        {
            setLocation(17,764);
            HP += 3;
        }
        if (LIVES <= 0)
        {
            Greenfoot.stop();
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
    }
    
    /**
     * how we attack
     */
   // public void Swing()
   // {
   //     if (Greenfoot.isKeyDown("e"))
   //     {
   //         setImage("Auridine-attack.gif");
   //     }
   //}
}