//Pet.java
import java.util.*;
import java.io.*;


abstract class Pet implements Serializable{
    private String breed;
    private String petName;
    private String sound;
    private Pleasant happy;
    private Health sick;
    private Hunger hungry;
    private Unpleasant sad;

    public Pet(){
       petName = "Molly";
       breed = "Poodle";
       sound = "Wooph";
       happy = new Pleasant();
       sad = new Unpleasant();

    }//end Constructor
   
    public void setNewName(String name){
       this.petName = name;
    }//end set new name
    public void giveNewName(){
      Scanner input = new Scanner(System.in);
      System.out.println("What name do you want to give your pet?");
      String petName = input.nextLine();
      System.out.println("your pet New name is:" + petName);

    }//end get new name

    public String petData(){
      return "Pet Name: " + petName +
      '\n' + "Pet Breed: " + breed + '\n'+
      "pet Sound: " + sound + '\n' + "mood status: " +
      happy.getMoodLevel() + '\n'+ "health status: "+ sad.getMoodLevel();
    }//end petData
    public void petMenu(){
  
         boolean keepGoing = true;         
        //menu options
         String menu = "Choose the action:\n"+
            "1.Change the pet name\n" +
            "2. Play With the pet\n"+
            "3. Feed the pet\n"+
            "4. put the pet to sleep\n"+
            "5. Check health status\n"+
            "6. exit\n";
      
      while(keepGoing){ 
        System.out.println(menu);

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
            
       
        if(num.equals("1")){
           giveNewName();
        }

        else if(num.equals("2")){
           keepGoing = false;
           play(); 
        }

        else if(num.equals("3")){
           feed();
        }

        else if(num.equals("4")){
           sleep();
        }

        else if(num.equals("5")){
           healthStatus();
           
        }   
        else if(num.equals("6")){
         keepGoing = false;
         System.out.print("See you soon!");
        }     
      }//end while        
    }//end menu 

      public void play(){
         happy.setMoodLevel(10);     
         
         
      }

      public void feed(){
         hungry.setMoodLevel(0);
         
      }
      public void sleep(){
         happy.setMoodLevel(10); 
      }
      
      public void healthStatus(){
        sick.setMoodLevel(10);
      }
    
   }

