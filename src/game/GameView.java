package game;

import city.cs.engine.*;

import java.awt.*;

import javax.swing.*;



    public class GameView extends UserView {

        private Image background;
        private Image heartImage;
        private Font font;
        private GameLevel  currentLevel;

        private int numHearts;


        public GameView(GameLevel currentLevel,int width, int height) {
            super(currentLevel, width, height);
            this.currentLevel = (Level1) currentLevel;
            background = new ImageIcon("data/background4.gif").getImage();
            heartImage = new ImageIcon("data/heart.jpeg").getImage();
            font = new Font("SansSerif", Font.BOLD, 18);
        }


        @Override
        protected void paintBackground(Graphics2D g) {
            g.drawImage(background, 0, 0,this);
        }

        @Override
        protected void paintForeground(Graphics2D g) {
            g.setColor(Color.RED);

            int x = 10;
            int y = getHeight() - 20;
            Boy b = this.currentLevel.getBoy();
          // g.fillRect(30,20,b.getHealth(),5);
            int numHearts = this.currentLevel.getBoy().getHealth();
            for (int i = 0; i < numHearts; i++) {
                g.drawImage(heartImage, i * 30, 580, 30, 20, this);
            }
                //g.drawImage(heartImage, x, y, 30, 20, null);
               // x += 25;
                //g.drawImage(heartImage, x, y, 30, 20, null);
                 //x += 25;
               // g.drawImage(heartImage, x, y, 30, 20, null);
               // x += 25;
           g.setFont(new Font("TimesRoman", 0, 20));
           g.drawString("Score: " + b.getWine(), 10, 20);


            }
        }








         //{
             //g.drawString("HealthBar",World.getBoy().getHealth(),9);
         //}


