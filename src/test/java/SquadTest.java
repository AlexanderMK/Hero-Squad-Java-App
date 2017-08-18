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

  //reason for joining the team
	@Test
	public void getReason_teamInstantiatesWithTeam_ComputerIlliteracy() {
		assertEquals("computer illiteracy", testSquad.getReason());
	}

  //all instances
  @Test
  public void all_returnsAllInstancesOfSquad_true() {
    Squad testSquadTwo = new Squad("X-men", 5, "computer illiteracy");
    assertEquals(true, Squad.all().contains(testSquad));
    assertEquals(true, Squad.all().contains(testSquadTwo));
  }
}
