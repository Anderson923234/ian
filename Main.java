import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Where would you like your adventure to begin?");
    String setting=input.nextLine();
    System.out.print("Who would you like to be?");
    String character=input.nextLine();
    System.out.print("What is your favorite color?");
    String color=input.nextLine();
    Story youChoose=new Story(setting, character, color);
    youChoose.read();
}
public static class Story{
  String setting, character, color;
  public Story(String startSetting, String startCharacter, String startColor){
    setting=startSetting;
    character=startCharacter;
    color=startColor;
  }
  public void read(){
  System.out.println("You are in the "+setting+".");
  System.out.println("You are "+character+".");
  System.out.println("Your favorite color is "+color+".");
    //Hi Logan was here.    
}}}
