import greenfoot.*;

/**
 * This is a stick man. Make him run and jump.
 * 
 * @author 
 * @version 
 */
public class Stickman extends Actor
{
    /**
     * Make the stickman act.
     */
   Boolean over;
   public void act() 
    {  
       moveLeftIfNoise();
       checkGameOver();
       if (over = true) {
           gameOver();
        }
    }
  
    public void moveLeftIfNoise() {
    int x=5;
       if (x > 3) {
	setRotation(180);
       	 move(4);
       } else {
	setRotation(360);
       	move(4);
    }
   } 
   
   public void gameOver() {
       //Greenfoot.playSound("gameover.wav");
    }
    
   public void checkGameOver() {
       if (isAtEdge()) {
           over = true;
        }
        
       if (isTouching(wombat.class))
        {
          over = true;
        }
    }
}
