package votingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class castVoteUnit {

	@Test
	public void test() {
		votingSystemTestUnit systemTest = new votingSystemTestUnit();
		assertEquals(true, systemTest.castVote(0)); //pass in 0 so should be true to allow voter to vote
			
	}

}
