package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Your main game entry point
 */
public class Game {

    private Boy boy;
    private GameView view;

    BoyController boyController;
    GameLevel currentLevel;


    /**
     * Initialise a new Game.
     */
    public Game() {

        //1. make your game world
        currentLevel = new Level1(this);
//Level2 currentLevel= new Level2(this);

        //2. make a view to look into the game world
        view = new GameView(currentLevel, 600, 600);
        //optional: draw a 1-metre grid over the view
        //view.setGridResolution(1);
        boyController = new BoyController(currentLevel.getBoy());
        view.addKeyListener(boyController);
        WifeController wifeController = new WifeController(currentLevel.getWife());
        view.addKeyListener(wifeController);


        view.addMouseListener(new GiveFocus(view));
        //3. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);
        frame.requestFocus();


        //optional: uncomment this to make a debugging view
        // JFrame debugView = new DebugViewer(world, 500, 500);

        //frame.addKeyListener(new BoyController(world.getDynamicBodies()) {


        // start our game world simulation!
        currentLevel.start();
    }


    public void goToNextLevel() {
        if (currentLevel instanceof Level1) {
            if (currentLevel.isComplete()) {
                System.out.println("Level 1 completed");
                currentLevel.stop();
                Boy boy1 = currentLevel.getBoy();
                currentLevel = new Level2(this);
                Boy boy2 = currentLevel.getBoy();
                //level now refer to the new level
                view.setWorld(currentLevel);
                boyController.updateBoy(currentLevel.getBoy());
                currentLevel.start();
            } else {
                System.out.println("Hell No");
            }
        }
        else if (currentLevel instanceof Level2) {
                System.out.println("Well done! Game complete.");
                System.exit(0);
            }
        }




    /**
     * Run the game.
     */
    public static void main(String[] args) {

        new Game();
    }
}



