import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 1;
    assertEquals(score, app.scrabbleScore("a"));
  }

/*
  @Test
  public void isPingPong_array() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> testArray = new ArrayList<Object>();
    testArray.add(1);
    testArray.add(2);
    assertEquals(testArray, testPingPong.isPingPong(2));
  }
*/
  // @Test
  // public void isPingPong_arrayPing() {
  //   PingPong testPingPong = new PingPong();
  //   ArrayList<Object> testArray = new ArrayList<Object>();
  //   testArray.add(1);
  //   testArray.add(2);
  //   testArray.add("ping");
  //   assertEquals(testArray, testPingPong.isPingPong(3));
  // }
