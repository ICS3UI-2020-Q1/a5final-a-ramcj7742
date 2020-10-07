import java.util.Scanner;
/**
 * Prints "black, white" amount of times as user number
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //Gets number from user
    System.out.println("Please enter the length of the line:");
    int userNum = input.nextInt();

    //loop that repeat prints black and white
    for(int i = 1; i < userNum; i++){

      //detects if count number is even or odd
      if(i % 2 != 0){
        System.out.print("black, ");
      }else System.out.print("white, ");

      //prints last word without comma at the end
      if(i == userNum - 1 && userNum % 2 == 0){
        System.out.print("white");
      }else if(i == userNum - 1){
        System.out.print("black");
      }
    }
    
  }
}
