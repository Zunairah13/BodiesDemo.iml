package game;
import city.cs.engine.*;

public class Wine extends Walker {
    private static final Shape wineShape = new PolygonShape(
            -0.11f,2.08f,
            0.87f,1.68f,
            0.99f,0.49f,
            0.24f,-2.0f,
            -0.95f,-2.0f,
            -1.14f,1.41f);



    private static final BodyImage image =
            new BodyImage("data/wine2.jpeg", 2f);


    //private int credits = 0;

    public Wine(World world) {
        super(world, wineShape);
        addImage(image);

        //credits = 0;
}

    //public void setCredits(int credits){
       // this.credits = credits;
    //}
    //public int getCredits(){
        //return credits;
    //}
}

