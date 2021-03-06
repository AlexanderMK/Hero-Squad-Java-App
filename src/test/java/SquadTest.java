import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  //runs before every test to instantiate squad object

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

  //test to empty squad lists
  @Test
  public void clear_emptiesAllSquadsFromList_0() {
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  // the first squad instantiates with id 1, then 2, etc
  @Test
  public void getId_squadInstantiatesWithAnId_1() {
    assertEquals(1, testSquad.getId());
  }

  //instantiating a Squad with an empty heroes List
  @Test
  public void getHeroes_initiallyReturnsEmptyList_Arraylist() {
    assertEquals(0, testSquad.getHeroes().size());
  }

  //adds heros to a squad
  @Test
  public void addHeroes_addHeroToList_true(){
    Squad.clear();
    Hero testHero = new Hero("NinjaMan",  30, "Strength, speed", "cannot run");
    testSquad.addHero(testHero);
    assertTrue(testSquad.getHeroes().contains(testHero));
  }
}
