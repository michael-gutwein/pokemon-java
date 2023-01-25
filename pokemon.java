import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

class Pokemon{
  private String num;
  private String name;
  private String type;
  private String hp;
  private String ap;
  private String dp;
  private String status = "";
  
 public Pokemon(String num, String name, String type, String hp, String ap, String dp, String status) {
   
  this.num = num;  
  this.name = name;
  this.type = type;
  this.hp = hp;
  this.ap = ap;
  this.dp = dp;
  this.status = status;

 }
    public String getNum() {
  return num; 
 }
    public void setNum(String num) {
        this.num = num;
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
  
   public String getHealth() {
  return hp; 
 }
   public void setHealth(String hp) {
        this.hp = hp;
    }
   
    public String getAttack() {
  return ap; 
 }
     public void setAttack(String ap) {
        this.ap = ap;
    }
    public String getDefence() {
  return dp; 
 }
    public void setDefence(String dp) {
        this.dp = dp;
    }
    
    public String getStatus() {
      return null;
    }
    public void setStatus(String status) {
      this.status = status;
    }
    
    
    public String toString(){
       
            return num +"." + " " + name + " " + type + " " + hp + " " + ap + " " + dp;
        }
     
    

    

 public static ArrayList<Pokemon> ReadingPokemon() {
   ArrayList <Pokemon> PokemonGenerator = new ArrayList<Pokemon>();
   
 try {
 File pokemon = new File("pokemon.csv");
 Scanner ScanPokemon = new Scanner(pokemon);
 while (ScanPokemon.hasNextLine()) {
 String lineP = ScanPokemon.nextLine();
 String[] pList = lineP.split(",");
 Pokemon p =  new Pokemon(pList[0], pList[1], pList[2], pList[3], pList[4], pList[5], pList[0]);{
   PokemonGenerator.add(p);
 }
 
 }
 ScanPokemon.close();
 }
 catch (FileNotFoundException e) {
 System.out.println("File does not exist.");
 }
 return PokemonGenerator;
}
 
 public static int RandomNumber(){
   
 int number = 0 + (int) (Math.random() * 152);
 
 return number;
 }

 public static Pokemon RandomPokemon(){
  int number = RandomNumber();
  ArrayList<Pokemon> All = ReadingPokemon();
  return All.get(number);
   
   
 }
 public void generateTeam(){
    ReadingPokemon();
 RandomPokemon();
 
 for(int i = 1; i<= 4; i++){
 System.out.println(RandomPokemon()); 
 }
   
   
 }
 
 
 public static void main(String[] args){
   
 ReadingPokemon();
 RandomPokemon();
 
 for(int i = 1; i<= 4; i++){
 System.out.println(RandomPokemon()); 
 }
 }
 

 
 
}
    
 





