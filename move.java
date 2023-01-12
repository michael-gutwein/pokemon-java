class Move{
  private String name;
  private String type;
  private String power;
  
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
    
 

}