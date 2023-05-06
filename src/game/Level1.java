package game;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import org.jbox2d.common.Vec2;

public class Level1 extends GameLevel {

    private Game game;

    public Level1(Game game) {
        super(game);
        Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(0, -12f));
        platform1.addImage(new BodyImage("data/dancefloor3.jpeg", 3));
        //platform1.setAngleDegrees();

        StaticBody platform2 = new StaticBody(this, platformShape);
        platform2.setPosition(new Vec2(-9, -9f));
        platform2.addImage(new BodyImage("data/dancefloor.jpeg", 3));

        StaticBody platform3 = new StaticBody(this, platformShape);
        platform3.setPosition(new Vec2(0, -6));
        platform3.addImage(new BodyImage("data/dancefloor.jpeg", 4));

        StaticBody platform4 = new StaticBody(this, platformShape);
        platform4.setPosition(new Vec2(11, -3.5f));
        platform4.addImage(new BodyImage("data/dancefloor2.jpeg", 3));

        StaticBody platform5 = new StaticBody(this, platformShape);
        platform5.setPosition(new Vec2(2, 1f));
        platform5.addImage(new BodyImage("data/dancefloor2.jpeg", 3));

        StaticBody platform6 = new StaticBody(this, platformShape);
        platform6.setPosition(new Vec2(-8, 3.5f));
        platform6.addImage(new BodyImage("data/dancefloor.jpeg", 4));

        StaticBody platform7 = new StaticBody(this, platformShape);
        platform7.setPosition(new Vec2(2, 7f));
        platform7.addImage(new BodyImage("data/dancefloor2.jpeg", 3));

        StaticBody platform8 = new StaticBody(this, platformShape);
        platform8.setPosition(new Vec2(10, 9.5f));
        platform8.addImage(new BodyImage("data/dancefloor3.jpeg", 3));

        getWine().setPosition(new Vec2(10, 12));
        getWine2().setPosition(new Vec2(1, -10));
        getWine3().setPosition(new Vec2(-9, -9));
        getWine4().setPosition(new Vec2(10, 3));
        getWine5().setPosition(new Vec2(0, -3));
        getWine6().setPosition(new Vec2(-9, 11));

        getFood().setPosition(new Vec2(12, 13));
        getFood2().setPosition(new Vec2(-1, -9));
        getFood3().setPosition(new Vec2(2, 5));
        getFood4().setPosition(new Vec2(2, 10));

    }


    @Override
    public boolean isComplete() {
       return getBoy().getWine()>=2;
    }
}
    //@Override
   // public String getLevelName() {
     //   return "Level 1";
   // }



    //private Boy getBoy() {
    //}

//}
