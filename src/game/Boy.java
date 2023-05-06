package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import java.awt.*;

public class Boy extends Walker {


    private static final Shape BoyShape = new PolygonShape(
            -0.11f, 2.08f,
            0.87f, 1.68f,
            0.99f, 0.49f,
            0.24f, -2.0f,
            -0.95f, -2.0f,
            -1.14f, 1.41f);

    private static final BodyImage image =
            new BodyImage("data/boy.jpg", 4f);


    //public String getHealthBar() {
    // return HealthBar;
    //}
    //@Override
    //protected void paintComponent(Graphics g){
    // super.paintComponent(g);
    // Graphics2D g2 = (Graphics2D)g;
    // paintBackground(g2);
    // paintForeground(g2);
    //}


    private int wineCount = 0;
    private int FoodCount = 0;
    private int health;
    private int maxHealth;
    public Boy(World world) {
        super(world, BoyShape);
        addImage(image);
        wineCount = 0;
        FoodCount = 0;
        health = 3;
        maxHealth = 3;
    }



    public int getWine() {
        return wineCount;
    }

    public void incrementWineCount() {
        ++this.wineCount;
        System.out.println("Getting more Tipsy!" + this.wineCount);
    }

    public int getFood() {
        return FoodCount;
    }

    public void incrementFoodCount() {
        ++this.FoodCount;
        System.out.println("Getting full" + this.FoodCount);
    }

    public void decreaseLife() {
        if (health > 0) {
            health--;
        }
    }
    public void increaseHealth() {
        if (health < maxHealth) {
            health++;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }


}


   // private int health = 3;
   // private static Image heartImg;

    //public void decreaseLife () {
        //health-= 1;
       // for (int i=0; i < health; i++) {
            //heartImg = new Image("data/fullheart.png",4f);
       // }
   // }

   // public int getHealth() {
      //  return health;
   // }
//}





