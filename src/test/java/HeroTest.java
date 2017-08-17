import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
	public void Hero_instantiatesCorrectly_true() {
		assertTrue(testHero instanceof Hero);
	}

  @Test
	public void getName_returnsName_NinjaMan() {
		assertEquals("NinjaMan", testHero.getName());
	}

}
