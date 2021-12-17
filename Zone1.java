import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone1 extends World
{
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

        Wide wide = new Wide();
        addObject(wide,410,648);
        Wide wide2 = new Wide();
        addObject(wide2,175,320);
        Wide wide3 = new Wide();
        addObject(wide3,274,454);

        meduim meduim = new meduim();
        addObject(meduim,530,760);
        meduim meduim2 = new meduim();
        addObject(meduim2,218,620);
        meduim meduim3 = new meduim();
        addObject(meduim3,63,588);
        meduim meduim4 = new meduim();
        addObject(meduim4,478,404);

        bullets bullets = new bullets();
        addObject(bullets,592,667);

        nextWorld nextWorld = new nextWorld();
        addObject(nextWorld,90,290);

        small small = new small();
        addObject(small,578,700);
        small small2 = new small();
        addObject(small2,37,784);
        small small3 = new small();
        addObject(small3,263,740);
        small small4 = new small();
        addObject(small4,364,769);
        small small5 = new small();
        addObject(small5,149,764); 
        small small6 = new small();
        addObject(small6,32,540);
        small small7 = new small();
        addObject(small7,92,485);
        small small8 = new small();
        addObject(small8,554,338);
        small small9 = new small();
        addObject(small9,468,287);
        small small10 = new small();
        addObject(small10,352,297);

        spikes spikes = new spikes();
        addObject(spikes,534,749);
        spikes spikes2 = new spikes();
        addObject(spikes2,417,637);
        spikes spikes3 = new spikes();
        addObject(spikes3,207,609);
        spikes spikes4 = new spikes();
        addObject(spikes4,298,445);
        spikes4.setLocation(296,444);
        spikes spikes5 = new spikes();
        addObject(spikes5,586,324);
        spikes5.setLocation(585,326);
        bullets bullets2 = new bullets();
        addObject(bullets2,591,506);
        bullets bullets3 = new bullets();
        addObject(bullets3,589,276);
    }
}
