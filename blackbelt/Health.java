//Health.java
import java.util.*;
import java.io.*;

public class Health extends PetAtribute implements Serializable{

    public Health(){
        scale = 10;
        mood=new ArrayList<String>();
        mood.add("vey Sick");
        mood.add("Sick");
        mood.add("headache");
        mood.add("stomach pain");
        mood.add("feel good");
        mood.add("feeling good like I should");
        level=new ArrayList<Integer>();
        level.add(0);
        level.add(5);
        level.add(10);
    }
    
}
