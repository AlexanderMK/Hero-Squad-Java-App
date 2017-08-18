import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  //instances
  @Test
  public void Squad_instantiatesCorrectly_true() {
    assertTrue(testSquad instanceof Squad);
  }
}
