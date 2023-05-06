package game;

import city.cs.engine.Walker;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import org.jbox2d.common.Vec2;

public class WifeController extends KeyAdapter {
    private static final float JUMPING_SPEED = 15.0F;
    private static final float WALKING_SPEED = 4.0F;
    private Walker wife;

    public WifeController(Walker wife) {
        this.wife = wife;
    }

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 81) {
            System.exit(0);
        } else if (code == 83) { // down
            this.wife.applyImpulse(new Vec2(0.0F, 40.0F));
        } else if (code == 65) { // left
            this.wife.startWalking(-4.0F);
        }else if (code == 87) { // up
            this.wife.jump(12.0F);
        } else if (code == 68) { // right
            this.wife.startWalking(4.0F);
        }
        else if (code == KeyEvent.VK_Q) {
            System.exit(0);
        }

    }

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 49) {
            this.wife.stopWalking();
        } else if (code == 50) {
            this.wife.stopWalking();
        }

    }

}
