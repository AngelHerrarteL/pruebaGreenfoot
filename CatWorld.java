import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An empty small world with a cat.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class CatWorld  extends World
{

    /**
     * Constructor for objects of class CatWorld.
     * 
     */
    public CatWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(600, 340, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MyCat myCat = new MyCat();
        addObject(myCat,103,115);
        myCat.setLocation(254,121);
        addObject(myCat,503,107);
        MyCat myCat2 = new MyCat();
        addObject(myCat2,182,153);
        myCat.setLocation(428,104);
    }
}
