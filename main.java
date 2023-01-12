import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class main{
public static void main(String[] args) {
 try {
 File pokemon = new File("pokemon.csv");
 File moves = new File("moves.csv");
 Scanner ScanPokemon = new Scanner(pokemon);
 Scanner ScanMoves = new Scanner(moves);
 while (ScanPokemon.hasNextLine()) {
 String lineP = ScanPokemon.nextLine();
 String[] pList = lineP.split(",");
 Pokemon p =  new Pokemon(pList[0], pList[1], pList[2], pList[3], pList[4], pList[5]);{
 }
     System.out.println(p);
 }
   while (ScanMoves.hasNextLine()) {
 String lineM = ScanMoves.nextLine();
 String[] mList = lineM.split(",");
 Move m =  new Move(mList[0], mList[1], mList[2]);{
 }   
    System.out.println(m);

}
   
 
 ScanPokemon.close();
 }
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }



 
}
 }