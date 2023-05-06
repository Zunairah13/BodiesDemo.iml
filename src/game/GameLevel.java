package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;
import org.jbox2d.common.Vec2;

public abstract class GameLevel extends World {

    private Boy boy;
    private Wife wife;

    private Game game;
  private Wine wine;
 private Wine wine2;
 private Wine wine3;
 private Wine wine4;
 private Wine wine5;
 private Wine wine6;
 private Food food;
 private Food food2;
 private Food food3;
 private Food food4;
    public GameLevel (Game game) {

        this.game = game;

        Shape shape = new BoxShape(22, 1.5f);
        StaticBody ground = new StaticBody(this, shape);
        ground.setPosition(new Vec2(0f, -16.8f));

        StaticBody ground2 = new StaticBody(this, shape);
        ground2.setPosition(new Vec2(.4f, 16.8f));

        Shape wallShape = new BoxShape(1.5f, 21);
        StaticBody wall1 = new StaticBody(this, wallShape);
        wall1.setPosition(new Vec2(-16.5f, -4));

        StaticBody wall2 = new StaticBody(this, wallShape);
        wall2.setPosition(new Vec2(16.5f, -4));

        boy = new Boy(this);
        boy.setPosition(new Vec2(7, -6));
        wife = new Wife(this);
        wife.setPosition(new Vec2(-5, -4));

        WifeEncounter wifeEncounter = new WifeEncounter(boy, wife, this, game);
        boy.addCollisionListener(wifeEncounter);
        wife.addCollisionListener(wifeEncounter);

         wine = new Wine(this);
        wine.setAlwaysOutline(true);

         wine2 = new Wine(this);
        wine2.setAlwaysOutline(true);

         wine3 = new Wine(this);
        wine3.setAlwaysOutline(true);

         wine4 = new Wine(this);
        wine4.setAlwaysOutline(true);

         wine5 = new Wine(this);
        wine5.setAlwaysOutline(true);

         wine6 = new Wine(this);
        wine6.setAlwaysOutline(true);

         food = new Food(this);

         food2 = new Food(this);

         food3 = new Food(this);

         food4 = new Food(this);


        for (int i = 0; i < 10; ++i) {
            wine.setPosition(new Vec2((float) (i * 2 - 10), 10.0F));
            wine.addCollisionListener(new WinePickup(this.boy,this,game));
            wine2.addCollisionListener(new WinePickup(this.boy,this,game));
            wine3.addCollisionListener(new WinePickup(this.boy,this,game));
            wine4.addCollisionListener(new WinePickup(this.boy,this,game));
            wine5.addCollisionListener(new WinePickup(this.boy,this,game));
            wine6.addCollisionListener(new WinePickup(this.boy,this,game));

        }
        for (int i = 0; i < 10; ++i) {
            food.setPosition(new Vec2((float) (i * 2 - 10), 16.0F));
            food.addCollisionListener(new FoodPickup(this.boy));
            food2.addCollisionListener(new FoodPickup(this.boy));
            food3.addCollisionListener(new FoodPickup(this.boy));
            food4.addCollisionListener(new FoodPickup(this.boy));

        }






        }



    public Boy getBoy() {
        return boy;
    }

    public Wife getWife() {
        return wife;
    }

    public Wine getWine() {
        return wine;
    }

    public Wine getWine2() {
        return wine2;
    }

    public Wine getWine3() {
        return wine3;
    }

    public Wine getWine4() {
        return wine4;
    }

    public Wine getWine5() {
        return wine5;
    }

    public Wine getWine6() {
        return wine6;
    }

    public Food getFood() {
        return food;
    }

    public Food getFood2() {
        return food2;
    }

    public Food getFood3() {
        return food3;
    }

    public Food getFood4() {
        return food4;
    }

    public abstract boolean isComplete();


}
