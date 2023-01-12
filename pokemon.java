class Pokemon{
  private String num;
  private String name;
  private String type;
  private String hp;
  private String ap;
  private String dp;
  
 public Pokemon(String num, String name, String type, String hp, String ap, String dp) {
   
  this.num = num;  
  this.name = name;
  this.type = type;
  this.hp = hp;
  this.ap = ap;
  this.dp = dp;
   
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
    
    
    public String toString(){
       
            return num +"." + " " + name + " " + type + " " + hp + " " + ap + " " + dp;
        }
    

    
 

}


