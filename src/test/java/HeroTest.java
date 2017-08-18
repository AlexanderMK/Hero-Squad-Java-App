import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {


  @Before
	public void instanciate() {
		testHero = new Hero("NinjaMan",  30, "Strength, speed", "cannot run");
	}

  @Test
	public void Hero_instantiatesCorrectly_true() {
		assertTrue(testHero instanceof Hero);
	}

  @Test
	public void getName_returnsName_NinjaMan() {
		assertEquals("NinjaMan", testHero.getName());
	}

  @Test
  public void getAge_returnsAge_30() {
    assertEquals(30, testHero.getAge());
  }

  @ Test
  public void getAbility_returnsAbility_Strength() {
    assertEquals("Strength, speed", testHero.getAbility());
  }

  @Test
  public void getWeakness_returnsAbility_CannotRun() {
    assertEquals("cannot run", testHero.getWeakness);
  }

  @Test
  public void all_returnsAllInstancesoOfHero_true() {
    Hero anotherHero = new Hero("Commando", 35, "Fighter,use machinegun, getting old" );
    assertTrue(Hero.all().contains(testHero));
		assertTrue(Hero.all().contains(anotherHero));
  }

  @Test
  public void clear_emptiesAllHerosFromList_0() {
    Hero.clear();
    assertEquals(0, Hero.all().size());
  }

  @Test
  public void getId_returnsInstantiateWithAnId_1() {
    assertEquals(1, testHero.getId());
  }

  @Test
  public void find_returnsHeroWithSameId_AnotherHero() {
    Hero anotherHero = new Hero("NinjaMan", 31, "Strength, speed", "cannot run");
    assertEquals(anotherHero.Hero.find(anotherHero.getId()));
  }
}
