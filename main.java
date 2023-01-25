import java.util.Scanner;
import java.util.ArrayList;

class main{

    public static String getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Pokemon! What is your trainer name?");
        String TrainerName = "Trainer " + input.nextLine();
       System.out.println(TrainerName);
       System.out.println("Your name is " + TrainerName + "? That is a cool name!");
        return TrainerName;
        
    }
    
    
    public static void main(String[] args) {

    getName();
    Scanner input = new Scanner(System.in);
    System.out.println("What do you want to do? [Select 1 or 2]");
    System.out.println("[PLAY]        [EXIT]"); 
    String choice = input.nextLine(); 
    if (choice == "2"){
      
      System.out.println("a");
    }
    else if(choice == "1"){

      

      
    }

    }
}