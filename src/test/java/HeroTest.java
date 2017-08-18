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
    assertEquals("Cannot run", testHero.getWeakness);
  }
}
