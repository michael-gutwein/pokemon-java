import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Move{
  private String name;
  private String type;
  private String power;
  private String status;
  //import static method that reads all the things and stores it 
 public Move(String name, String type, String power) {
   
  this.name = name;
  this.type = type;
  this.power = power;
 }
 
 public Move(Move special){
  this.type = type; 
  this.status = status;
 }
 
 
 public String getName() {
  return name; 
 }
 
 public void setName(String name) {
        this.name = name;
    }
 
  public String getType() {
  return type; 
 }
  
   public void setType(String type) {
        this.type = type;
    }

    public String getPower() {
  return power; 
 }
    public void setPower(String Power) {
        this.power = power;
    }
    
    
    public String toString(){
       
            return name + " " + type + " " + power;
        }
    
    public boolean canUseMove(){
      
      if(type == type){
       return true;
      }
      else{
        return false;
       
      }
      
    }
    
    public Pokemon[] a(){
      
      
     return  null;
    }
    
     public static void moves(String[] args) {
 try {
     File moves = new File("moves.csv");
     File Smoves = new File("special_status_pokemon.csv");
     Scanner ScanMoves = new Scanner(moves);
     Scanner ScanSmoves = new Scanner(Smoves);
        while (ScanMoves.hasNextLine()) {
 String lineM = ScanMoves.nextLine();
 String[] mList = lineM.split(",");
 Move m =  new Move(mList[0], mList[1], mList[2]);{
 }   
    
}
   while (ScanSmoves.hasNextLine()) {
     String lineSM = ScanSmoves.nextLine();
     String[] smList = lineSM.split(",");
     Move special = new Move(smList[0], smList[1], smList[2]);{
     }
     
   }
 

}
  catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
     }
}