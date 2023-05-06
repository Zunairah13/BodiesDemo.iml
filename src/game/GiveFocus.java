package game;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GiveFocus extends MouseAdapter{

        private Component target;

        public GiveFocus(Component target) {
            this.target = target;
        }

        public void mouseEntered(MouseEvent e) {
            this.target.requestFocus();
        }
    }


