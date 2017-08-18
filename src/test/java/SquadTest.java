import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  //instances
  @Test
  public void Squad_instantiatesCorrectly_true() {
    assertTrue(testSquad instanceof Squad);
  }

  //squad name
  @Test
  public void getName_teamInstantiatesWith_NinjaSquad() {
    assertEquals("NinjaSquad", testSquad.getName());
  }

  //maximum size of the squad
	@Test
	public void getMaximumSize_teamInstantiatesWithTeam_4() {
		assertEquals(4, testSquad.getMaximumSize());
	}
}
