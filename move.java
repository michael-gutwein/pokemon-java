import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

class Move{
  private String name;
  private String type;
  private String power;
  private String status;
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
    
     public static ArrayList<Move> ReadingMoves() {
        ArrayList <Move> MoveGenerator = new ArrayList<Move>();
 try {
     File moves = new File("moves.csv");
     File Smoves = new File("special_status_pokemon.csv");
     Scanner ScanMoves = new Scanner(moves);
     Scanner ScanSmoves = new Scanner(Smoves);
        while (ScanMoves.hasNextLine()) {
 String lineM = ScanMoves.nextLine();
 String[] mList = lineM.split(",");
 Move m =  new Move(mList[0], mList[1], mList[2]);{
   MoveGenerator.add(m);
 }   
    
}
 

}
  catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
  return MoveGenerator;
     }
      public static int RandomNumber(){
   
 int number = 1 + (int) (Math.random() * 151);
 
 return number;
 }
     
public static Move RandomMoves(){
  int number = RandomNumber();
  ArrayList<Move> AllMoves = ReadingMoves();
  
  return AllMoves.get(number);
   
   
 }
public static void main(String[] args){
 RandomMoves();
 ReadingMoves();
 
 for(int i = 1; i<= 4; i++){
 System.out.println(RandomMoves()); 
 }
 }
}