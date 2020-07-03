package example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Authenticator.class)
public class JUnit4Test {

	@Test
	@DisplayName("Junit 4 Test Mocking Static API")
	public void testPermission() {

		// Following two lines explains
		// 1. How to mock static APIs in a class
		// 2. How to manipulate/change the output of the static API
		PowerMockito.mockStatic(Authenticator.class);
		PowerMockito.when(Authenticator.hasPermission()).thenReturn(false);

		Assert.assertTrue("Permission not granted to Junit-4",Authenticator.hasPermission());
	}
}
