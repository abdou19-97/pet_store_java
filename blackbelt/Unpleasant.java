//Unpleasant.java
import java.util.*;
import java.io.*;

public class Unpleasant extends PetAtribute implements Serializable{

    public Unpleasant(){
        scale = 10;
        mood=new ArrayList<String>();
        mood.add("Sad");
        mood.add("Depressed");
        mood.add("Bored");
        mood.add("Fatigue");
        mood.add("Upset");
        level=new ArrayList<Integer>();
        level.add(-10);
        level.add(0);
        level.add(5);
        level.add(10);
    }
    
}
