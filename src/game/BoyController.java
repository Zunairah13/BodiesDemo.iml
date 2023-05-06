package game;

import city.cs.engine.Walker;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.jbox2d.common.Vec2;


   //private static final float WALKING_SPEED =6;
    public class BoyController extends KeyAdapter {
        private static final float JUMPING_SPEED = 15.0F;
        private static final float WALKING_SPEED = 6.0F;
        private Walker boy;

        public BoyController(Walker boy) {
            this.boy = boy;
        }

        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            if (code == 81) {
                System.exit(0);
            } else if (code == 32) {
                this.boy.applyImpulse(new Vec2(0.0F, 40.0F));
            } else if (code == 37) {
                this.boy.startWalking(-4.0F);
            }else if (code == 38) {
                    this.boy.jump(12.0F);
            } else if (code == 39) {
                this.boy.startWalking(4.0F);
            }
            else if (code == KeyEvent.VK_Q) {
                System.exit(0);
            }


        }

        public void keyReleased(KeyEvent e) {
            int code = e.getKeyCode();
            if (code == 49) {
                this.boy.stopWalking();
            } else if (code == 50) {
                this.boy.stopWalking();
            }

        }
        public void updateBoy(Boy newBoy) {
            boy= newBoy;
        }
    }




