import java.util.Scanner;


//basic turn system
class Player{
      public boolean isEnemyTurn;
  public Player(Pokemon pokemonTeam, boolean isEnemyTurn){


    
    
    
  }
  public void playerTurns(){
   
    
    if(isEnemyTurn == false){
       
      System.out.println("What will you do? Answer with [1], [2], [3], [4]");
      System.out.println("What will you do? Answer with [ATTACK], [ITEM], [SWAP, [RUN]");
      Scanner input = new Scanner(System.in);
      String response = input.nextLine();
      if(response == "1"){
        
        
        
        
      }
      
      
    
    
    
  }
  }
  
  
  
  
  public void enemyTurns(){
    
    if(isEnemyTurn == true){ 
 int Roll = 1 + (int) (Math.random() * 4);
 
 if (Roll == 1 ){
   
 

 }
      
    
    
    
    
  }

  
 
  
 

    
    
    
    

}
}