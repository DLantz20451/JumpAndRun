import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zone2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zone2 extends World
{
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
     * Zone2 World maker
     */
    private void prepare()
    {
        Auridine auridine = new Auridine();
        addObject(auridine,17,764);

        meduim meduim = new meduim();
        addObject(meduim,76,783);
        meduim meduim2 = new meduim();
        addObject(meduim2,109,557);
        meduim meduim3 = new meduim();
        addObject(meduim3,435,270);
        meduim meduim4 = new meduim();
        addObject(meduim4,264,368);
        meduim meduim5 = new meduim();
        addObject(meduim5,412,146);

        small small = new small();
        addObject(small,224,753);
        small small2 = new small();
        addObject(small2,445,650);
        small small3 = new small();
        addObject(small3,533,94);
        small small4 = new small();
        addObject(small4,238,511);
        small small5 = new small();
        addObject(small5,355,467);
        small small6 = new small();
        addObject(small6,134,332);
        small small7 = new small();
        addObject(small7,50,285);
        small small8 = new small();
        addObject(small8,156,240);
        small small9 = new small();
        addObject(small9,266,193);
        small small10 = new small();
        addObject(small10,418,389);

        Wide wide = new Wide();
        addObject(wide,409,726);
        Wide wide2 = new Wide();
        addObject(wide2,274,614);

        bullets bullets = new bullets();
        addObject(bullets,592,667);

        FinalFate finalFate = new FinalFate();
        addObject(finalFate,434,220);

        where where = new where();
        addObject(where,600,780);

        spikes spikes = new spikes();
        addObject(spikes,373,715);
        spikes spikes2 = new spikes();
        addObject(spikes2,258,602);
        spikes spikes3 = new spikes();
        addObject(spikes3,380,135);
        spikes spikes4 = new spikes();
        addObject(spikes4,465,135);

        bullets bullets2 = new bullets();
        addObject(bullets2,589,363);
        bullets bullets3 = new bullets();
        addObject(bullets3,591,76);
    }
}
