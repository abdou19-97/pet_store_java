//PetAtribute.java
import java.util.*;
import java.io.*;

abstract class PetAtribute implements Serializable {
    protected int scale;
    protected ArrayList<Integer> level;
    protected ArrayList<String> mood;
   
   //set the mood level it should from the 
   //decreasing order -10 to the increasing
   //order +10 
    public void setMoodLevel(int value){
        scale += value;
        //check if the scale is greater or less than 
        //the assgined level set the scale to the current level
        if(scale>level.get(level.size()-1)){

            scale = level.get(level.size()-1);

        }
        
        if(scale<level.get(level.size()-1)){

            scale = level.get(level.size() -1);

        }
        
    }
    //return the mood level
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
