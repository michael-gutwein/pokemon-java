import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class main{
public static void main(String[] args) {
 try {
 File pokemon = new File("pokemon.csv");
 File moves = new File("moves.csv");
 File Smoves = new File("special_status_pokemon.csv");
 Scanner ScanPokemon = new Scanner(pokemon);
 Scanner ScanMoves = new Scanner(moves);
 Scanner ScanSmoves = new Scanner(Smoves);
 while (ScanPokemon.hasNextLine()) {
 String lineP = ScanPokemon.nextLine();
 String[] pList = lineP.split(",");
 Pokemon p =  new Pokemon(pList[0], pList[1], pList[2], pList[3], pList[4], pList[5]);{
 }
    
 }
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
 ScanPokemon.close();
 }
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }

 


 
}
 }