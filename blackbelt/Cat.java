//Cat.java
import java.util.*;
import java.io.*;

public class Cat extends Pet implements Serializable{
    protected String sound;
    protected String breed;

    public Cat(){
       sound = "Meow";
       breed = "Abyssanian";
    }
   
    public void play(){
        System.out.println("Welcome to the cat play menu choose the game type:\n"+
        "1.Fetch\n"+
        "2.Ping Pong\n"+
        "3.Piece of String\n");
        Scanner input = new Scanner(System.in);
        String gameOption = input.nextLine();
        if(gameOption.equals("1") || gameOption.equals("2") || gameOption.equals("3")){
            System.out.println("Let's play!");
        }
        super.play(); 
    }
   

}
