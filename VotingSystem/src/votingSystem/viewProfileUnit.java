package votingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class viewProfileUnit {

	@Test
	public void test() {
		votingSystemTestUnit systemTest = new votingSystemTestUnit();
		assertEquals(true, systemTest.viewProfile("Hello")); //pass in a value so record not empty so should return true
			
	}

}
