import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zone2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone2 extends World
{
    Counter HP = new Counter();
    Counter LIVES = new Counter();
    /**
     * Constructor for objects of class Zone2.
     * 
     */
    public Zone2()
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

        where where = new where();
        addObject(where,302,773);

        Counter counter = new Counter("HP ");
        addObject(HP,552,18);
        HP.setValue(3);
        Counter counter2 = new Counter("LIVES ");
        addObject(LIVES,553,47);
        LIVES.setValue(3);

        nextWorld nextWorld = new nextWorld();
        addObject(nextWorld,37,256);

        Floor floor = new Floor();
        addObject(floor,310,790);

        Wide wide = new Wide();
        addObject(wide,460,737);
        Wide wide2 = new Wide();
        addObject(wide2,217,534);
        Wide wide3 = new Wide();
        addObject(wide3,254,283);

        meduim meduim = new meduim();
        addObject(meduim,153,773);
        meduim meduim2 = new meduim();
        addObject(meduim2,72,534);
        meduim meduim3 = new meduim();
        addObject(meduim3,360,449);
        meduim meduim4 = new meduim();
        addObject(meduim4,522,370);
        meduim meduim5 = new meduim();
        addObject(meduim5,419,282);

        small small = new small();
        addObject(small,256,762);
        small small2 = new small();
        addObject(small2,322,752);
        small small3 = new small();
        addObject(small3,567,685);
        small small4 = new small();
        addObject(small4,463,634);
        small small5 = new small();
        addObject(small5,368,578);
        small small6 = new small();
        addObject(small6,41,285);
        small small7 = new small();
        addObject(small7,68,480);
        small small8 = new small();
        addObject(small8,178,449);
        small small9 = new small();
        addObject(small9,389,390);
        small small10 = new small();
        addObject(small10,568,306);

        spikes spikes = new spikes();
        addObject(spikes,91,767);
        spikes spikes2 = new spikes();
        addObject(spikes2,403,733);
        spikes spikes3 = new spikes();
        addObject(spikes3,122,527);
        
        barrels barrels = new barrels();
        addObject(barrels,329,274);
        barrels barrels2 = new barrels();
        addObject(barrels2,467,773);
        barrels barrels3 = new barrels();
        addObject(barrels3,535,725);
        barrels barrels4 = new barrels();
        addObject(barrels4,23,525);
    }
}
