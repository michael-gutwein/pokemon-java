import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Movesets{
  private String name;
  private String type;
  private int power;
  
 public Move(String name, String type, String power) {
   
  this.name = name;
  this.type = type;
  this.power = power;
   
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
     public void setPower(String power) {
        this.power = power;
    }
 
}

public static void movesets(String[] args){
  
   try {
 File moves = new File("moves.csv");
 Scanner ScanMoves = new Scanner(moves);
 while (ScanMoves.hasNextLine()) {
 String lineM = ScanMoves.nextLine();
 String[] mList = lineM.split(",");
 
   Moves m =  new Moves(mList[0], mList[1], mList[2]);{
     System.out.println(m);
     
}
 }
 ScanMoves.close();
 }
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
  
}