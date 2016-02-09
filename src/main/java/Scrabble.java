import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class Scrabble {
  public static HashMap letters = new HashMap();

  public static void main(String[] args) {

  }

  public static Object getScore(char letter){
    return letters.get(letter);
  }

  public Scrabble() {
    letters.put('A', 1);
  }
}
