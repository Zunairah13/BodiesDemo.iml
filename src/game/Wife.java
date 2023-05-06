package game;

import city.cs.engine.*;

public class Wife extends Walker
{
        private game.Wife string;
        private static final Shape wifeShape = new PolygonShape(
                -0.11f,2.08f,
                0.87f,1.68f,
                0.99f,0.49f,
                0.24f,-2.0f,
                -0.95f,-2.0f,
                -1.14f,1.41f);

        private static final BodyImage image =
                new BodyImage("data/angry wife.jpg", 4f);


    public Wife(World world) {
        super(world, wifeShape);
        addImage(image);
    }
}

