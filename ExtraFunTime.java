//extra FunTime
package projects;
import java.util.Scanner;
class ExtraFunTime{

  public static void main(String[] args){
    FunTime words = new FunTime();
    words.setA1("This");
    words.setA2("is");
    words.setA3("fun");
    FunTime scar = new FunTime("fuck","this","class");
    System.out.println("preset statements");
    System.out.println(words.combineStrings());
    System.out.println(scar.combineStrings());
    printPretty(words);
    printPretty(scar);
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    Boolean check = true;
    while(check){
      System.out.println("Enter statement to print pretty");
      String input = myObj.nextLine();
      if(!input.equalsIgnoreCase("stop")){
        String funn[] = input.split(" ");
        FunTime inputNew = new FunTime(funn[0],funn[1],funn[2]);
        printPretty(inputNew);
      } else {
        check = false;
      }
    }
    System.exit(0);
  }
}
