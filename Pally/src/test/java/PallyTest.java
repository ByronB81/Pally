import org.junit.*;
import static org.junit.Assert.*;


public class PallyTest {

  @Test
  public void runPally_stringToArray_ArrayList() {
    Pally testPally = new Pally();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add("hi")
    assertEquals(expectedOutput, testPally.runPally("hi"));
  }

}
