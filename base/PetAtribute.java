//PetAtribute.java
import java.util.*;
import java.io.*;

abstract class PetAtribute implements Serializable {
    protected int scale;
    protected ArrayList<Integer> level;
    protected ArrayList<String> mood;

    
    public void setMoodLevel(int value){
        scale += value;
        if(scale>level.get(level.size()-1)){

            scale = level.get(level.size()-1);

        }
        
        if(scale<level.get(level.size()-1)){

            scale = level.get(level.size() -1);

        }
        
    }
    
    public String getMoodLevel(){
        int i;
        for(i = 0; i<level.size()-1; i++){
            if(level.get(i)>scale){
               return mood.get(i);
            }
            
        }
        return mood.get(i);
    }
     
    
}
