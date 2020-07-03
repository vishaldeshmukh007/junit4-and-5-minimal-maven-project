package example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JupiterTest {

	@Test
	@DisplayName("Vanila Junit 5 Test")
	public void testPermission() {
		Assertions.assertTrue(Authenticator.hasPermission(),"Permission not granted to Junit-4");
	}
}
