import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone1 extends World
{
    Counter HP = new Counter();
    Counter LIVES = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Zone1()
    {    
        super(600, 800, 1); 
        prepare();
        
    }

    /**
     * Zone1 World maker
     */
    private void prepare()
    {
        Auridine auridine = new Auridine();
        addObject(auridine,17,764);

        Counter counter = new Counter("HP ");
        addObject(HP,552,18);
        HP.setValue(3);
        Counter counter2 = new Counter("LIVES ");
        addObject(LIVES,553,47);
        LIVES.setValue(3);

        Floor floor = new Floor();
        addObject(floor,310,790);

        Wide wide = new Wide();
        addObject(wide,410,648);
        Wide wide2 = new Wide();
        addObject(wide2,440,310);
        Wide wide3 = new Wide();
        addObject(wide3,175,320);

        meduim meduim = new meduim();
        addObject(meduim,530,730);
        meduim meduim2 = new meduim();
        addObject(meduim2,218,620);
        meduim meduim3 = new meduim();
        addObject(meduim3,63,588);

        small small = new small();
        addObject(small,353,679);
        small.setLocation(424,737);
        small small2 = new small();
        addObject(small2,357,747);
        small small3 = new small();
        addObject(small3,288,757);
        small small4 = new small();
        addObject(small4,219,764);
        small small5 = new small();
        addObject(small5,557,688);
        small small6 = new small();
        addObject(small6,190,535);
        small small7 = new small();
        addObject(small7,283,530);
        small small8 = new small();
        addObject(small8,375,506);
        small small9 = new small();
        addObject(small9,443,458);
        small small10 = new small();
        addObject(small10,363,424);
        small small11 = new small();
        addObject(small11,470,390);
        small small12 = new small();
        addObject(small12,568,362);

        spikes spikes = new spikes();
        addObject(spikes,457,643);
        spikes spikes2 = new spikes();
        addObject(spikes2,358,644);
        spikes spikes3 = new spikes();
        addObject(spikes3,29,584);

        bullets bullets = new bullets();
        addObject(bullets,592,667);

        nextWorld nextWorld = new nextWorld();
        addObject(nextWorld,90,290);
    }
}
