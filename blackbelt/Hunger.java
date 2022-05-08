//Hunger.java
import java.util.*;
import java.io.*;

public class Hunger extends PetAtribute implements Serializable{

    public Hunger(){
        scale = 10;
        mood=new ArrayList<String>();
        mood.add("starving");
        mood.add("very hungery");
        mood.add("need a litle more");
        mood.add("full");
        level=new ArrayList<Integer>();
        level.add(0);
        level.add(5);
        level.add(10);
    }
    
}
