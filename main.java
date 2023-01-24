import java.util.Scanner;

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
      

    }
}