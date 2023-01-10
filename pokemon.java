import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class pokemon{

 public static void main(String[] args) {
 try {
 File pokemon = new File("pokemon.csv");
 File moves = new File("moves.csv");
 Scanner ScanPokemon = new Scanner(pokemon);
 Scanner ScanMove = new Scanner(moves);
 while (ScanPokemon.hasNextLine()) {
 String lineP = ScanPokemon.nextLine();
 System.out.println(lineP);
 }
  while (ScanMove.hasNextLine()) {
 String lineM = ScanMove.nextLine();
 System.out.println(lineM);
 }
 ScanPokemon.close();
 ScanMove.close();
 }
 
 
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
 }
}


