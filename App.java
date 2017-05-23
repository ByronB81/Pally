import java.io.Console;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a String");

    String userString = console.readLine();
    String[] userArray = userString.split("");
    List<String> list = Arrays.asList(userArray);
    Collections.reverse(list);

    userArray = (String[]) list.toArray();

    System.out.println("Reversed");
    System.out.println();

    for(int i=0; i < userArray.length; i++){
      System.out.print(userArray[i]);
    }

    System.out.println();

  }

}
