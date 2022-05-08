//Dog.java
import java.util.*;
import java.io.*;

class Dog extends Pet implements Serializable {
    
    protected String sound;
    protected String breed;

    public Dog(){
         sound = "Whoof";
         breed = "Poodle";
     }

    public void play(){
        System.out.println("Welcome to the dog play menu choose the game type:\n"+
        "1.Tug of War\n"+
        "2.Chasing Bublle\n"+
        "3.Fishbee\n");
        Scanner input = new Scanner(System.in);
        String gameOption = input.nextLine();
        if(gameOption.equals("1") || gameOption.equals("2") || gameOption.equals("3")){
            System.out.println("Let's play!");
        }
        super.play();
     }
     
    

}   
  
