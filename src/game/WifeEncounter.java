package game;

import city.cs.engine.CollisionEvent;
import city.cs.engine.CollisionListener;

    public class WifeEncounter implements CollisionListener {
        private Wife wife;
       private Boy boy;
        private GameView view;
        private GameLevel level;
        private Game g;


        public WifeEncounter(Boy b, Wife w,GameLevel level, Game game) {
            this.boy = b;
            this.wife= w;
            this.level=level;
            g=game;

        }
        public void collide (CollisionEvent e) {
            if (e.getOtherBody()==this.boy) {
                this.boy.decreaseLife();
                if (this.boy.getHealth() == 0) {
                    this.boy.destroy();
                }

                }
            //if (e.getOtherBody()==this.boy) {
               // if (level.isComplete()) {
                    //g.goToNextLevel();
               // }
            }
            }




