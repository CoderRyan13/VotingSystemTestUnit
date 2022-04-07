package votingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class addVoterUnit {

	@Test
    public  void testAddVoter() {
			votingSystemTestUnit systemTest = new votingSystemTestUnit();
			assertEquals(true, systemTest.addVoter(2015112274)); //pass in valid amount of numbers so should return true		
    
	}

}
