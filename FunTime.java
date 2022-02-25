//fun java project
package projects;
class FunTime{
  String A1;
  String A2;
  String A3;
  FunTime(){
    A1 = "";
    A2 = "";
    A3 = "";
  }
  public FunTime(String A1,String A2,String A3){
    this.A1=A1;
    this.A2=A2;
    this.A3=A3;
  }
  public void setA1(String A1){
    this.A1 = A1;
  }
  public void setA2(String A2){
    this.A2 = A2;
  }
  public void setA3(String A3){
    this.A3 = A3;
  }
  public String combineStrings(){
    String sum = A1+" "+A2+" "+A3;
    return sum;
  }
  public static void printPretty(FunTime obj){
    System.out.println("*******************************");//31
    String stringlength = obj.combineStrings();
    int num = stringlength.length();
    for(int k = 0; k< (31-num)/2;k++)
      System.out.print("*");
    System.out.print(stringlength);
    for(int k = 0; k< (31-num)/2;k++)
      System.out.print("*");
    System.out.println("\n*******************************\n");
  }
}
