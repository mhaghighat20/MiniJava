import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import parser.Parser;

public class Main {
  public static void main(String[] args) {

    Parser parser = new Parser();
    try {
      // start parsing
      ArrayList<String> result = parser.startParse(new Scanner(new File("src/main/resources/test2.java")));

      for (String item :
              result) {
        System.out.println(item);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }


  }
}



