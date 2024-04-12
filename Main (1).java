class Main{
  public static void sun(){
    System.out.print("shine");
  }
  public static void summer(int temp){
    if(temp>80){
      System.out.print("*");
      temp-=1;
      summer(temp);
    }
  }
  public static void main(String[] args){
    summer(91);
    sun();
  }
}