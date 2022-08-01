import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        final int sleepDuration = 2;
        this.sleep(sleepDuration); //durmamos un poquito
        
        if (this.isAlone() && this.isSleepy()) {
            this.sleep(sleepDuration);
        } else {
            this.shoutHooray();
            this.wait(sleepDuration);
            this.setBored(true);
        }
        
        if (this.isBored()) {
            this.dance();
        }
        
        if (this.isHungry()) {
            this.eat();
        }
        
        if (this.isSleepy()) {
            this.sleep(sleepDuration);
            this.shoutHooray();
        } else {
            this.shoutHooray();
        }
        
    }    
}
