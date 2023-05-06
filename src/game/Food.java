package game;

import city.cs.engine.*;

public class Food extends Walker {
    private game.Food string;
    private static final Shape foodShape = new PolygonShape(
            -0.11f, 2.08f,
            0.87f, 1.68f,
            0.99f, 0.49f,
            0.24f, -2.0f,
            -0.95f, -2.0f,
            -1.14f, 1.41f);

    private static final BodyImage image =
            new BodyImage("data/chips.jpeg", 2f);

    public Food(World world) {
        super(world, foodShape);
        addImage(image);
    }
}
