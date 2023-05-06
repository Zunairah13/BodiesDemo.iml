package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class WinePickup implements CollisionListener {
    private Boy boy;
    public GameLevel level;
    Game g;


    public WinePickup(Boy b, GameLevel level, Game game) {
        this.boy = b;
        this.level = level;
        g = game;

    }

    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == this.boy) {
            this.boy.incrementWineCount();
            e.getReportingBody().destroy();
            if (boy.getWine() == 2) {
                g.goToNextLevel();
            }


        }
    }
}
    //@Override
    //public void collide(CollisionEvent collisionEvent) {

   // }

