//Pleasnat.java
import java.util.*;
import java.io.*;
public class Pleasant extends PetAtribute implements Serializable{

  public Pleasant(){
    scale = 10;
    mood=new ArrayList<String>();
    mood.add("Alert");
    mood.add("Excited");
    mood.add("Elated");
    mood.add("Happy");
    mood.add("pleasure");
    level=new ArrayList<Integer>();
    level.add(-10);
    level.add(0);
    level.add(5);
    level.add(10);
  }
   
}
