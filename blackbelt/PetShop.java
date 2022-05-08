//PetShop.java
import java.util.*;
import java.io.*;

public class PetShop implements Serializable {
    protected ArrayList<Pet> pets = new ArrayList<Pet>();
    protected File petFile = new File("petFile.txt");
   
    

    public void ReadFile(){

        try {
            FileInputStream fin = new FileInputStream(petFile);
            ObjectInputStream obi = new ObjectInputStream(fin);
            pets = (ArrayList<Pet>)obi.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        } // end try


   }//end readfile

  public void SaveFile(){
              
        
        try{
        FileOutputStream fo = new FileOutputStream(petFile);
        ObjectOutputStream obo = new ObjectOutputStream(fo);
        obo.writeObject(pets);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
         
   } 
      
     
   public void petMainMenu(){
  
        boolean keepGoing = true;         
    
        String menu = "Choose the action:\n"+
        "1. add pet\n"+
        "2. list pet \n"+
        "3. remove pet\n" +
        "4. intract with the pet\n"+
        "5. exit";
    
        while(keepGoing){ 
        System.out.println(menu);

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
            
        
        if(num.equals("1")){
            addPet();
        }

        else if(num.equals("2")){
            listPets();
        }
        else if(num.equals("3")){
            removePet();
        }
        else if(num.equals("4")){
           interactWithPet();
        }
        else if(num.equals("5")){
            keepGoing = false;
            System.out.print("have a great day! ");
            
        }   
                
        }//end while        
    }//end mainMenu

    public void addPet(){
        boolean keepGoing = true;

        System.out.println("welcome to the add pet menu! ");
        System.out.println("Choose the pet type that you want add:\n"+
             "1. Cat\n"+
             "2. Dog \n"+
             "3. exit\n");
        Scanner input = new Scanner(System.in);
      
      while(keepGoing){

        if (input.hasNextLine()){  
            
             String userInput = input.nextLine(); 
             if(userInput.equals("1")){
                Dog d = new Dog();
                pets.add(d);
                keepGoing = false;
                System.out.println("The Dog added succefully!");
             }
             if(userInput.equals("2")){
                 Cat c = new Cat();
                 pets.add(c);
                 keepGoing = false;
                 System.out.println("The cat added succefully!");
             }  
             if(userInput.equals("3")){
                 keepGoing = false;
                System.out.println("See you soon in the add pet menu!");
             }
        }//end if
        else{
             System.out.println("Oops, something went wrong do you wanna try again?");
             String tryAgain = input.nextLine();

             if(tryAgain.equals("Yes")){
                 keepGoing = true;
             } //end if
             else{
                 keepGoing = false;
                 System.out.println("Sorry, I didn't understand! ");
                
              } //end else 
         } //end else 
             
      }//end while
       
    }
    public void listPets(){
             
        System.out.println("Welcome to the pet list!");
        for(int i=0; i<pets.size(); i++){
          System.out.println(pets.get(i).petData()); 
                     
         }//end for     
        System.out.println(pets.size());    

     }//end listPets

   public void removePet(){
        
        listPets();
        System.out.println("Welcome to the remove pet menu");
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        
        while(keepGoing){
           int indx=input.nextInt(); 
           if(input.hasNext()){

              if(indx>=0 && indx< pets.size()){
                    pets.remove(indx);
               }
               keepGoing = false;
               System.out.println("The pet is out the system");
           }
           else{
                System.out.println("Do you want to add new pet?");    
                if(indx==1){
                    addPet();
                 }
                else{
                    keepGoing = false;
                    System.out.println("I don't understand");
                    
                }
            }
             
         }

    }
   public void interactWithPet(){
        Dog d = new Dog();
        d.petMenu();
    }
    public static void main(String[] args){
          PetShop p = new PetShop();
          p.ReadFile();
          p.petMainMenu();
          p.SaveFile();   
    }
   
}
