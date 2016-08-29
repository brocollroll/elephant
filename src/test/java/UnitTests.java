import static org.junit.Assert.*;

import org.junit.Test;

import com.codebind.App;


public class UnitTests {

	App test = new App();
	@Test
	public void testSample() {
		
		String maven="hello maven!";
		assertEquals(maven,test.sample());
	}

}
