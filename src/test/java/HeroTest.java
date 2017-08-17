import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
	public void getName_returnsName_NinjaMan() {
		assertEquals("NinjaMan", testHero.getName());
	}

}
