package votingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class modifyUserUnit {

	@Test
	public void test() {
		votingSystemTestUnit systemTest = new votingSystemTestUnit();
		assertEquals(true, systemTest.modifyUser("unlocked")); //pass in unlocked so should be true to allow modification of user
			
	}

}
