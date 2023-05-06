package game;


import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

public class FoodPickup implements CollisionListener {
    private Boy boy;

    public FoodPickup(Boy b) {
        this.boy = b;
    }

    public void collide(CollisionEvent e) {
        if (e.getOtherBody() == this.boy) {
            this.boy.incrementFoodCount();
            this.boy.increaseHealth();
            e.getReportingBody().destroy();
        }
    }
}

