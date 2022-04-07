package votingSystem;

public class votingSystemTestUnit {  //ensures the numbers inputed is 10
	public boolean addVoter(int id) {
        int count = 0;
        
        while(id != 0) {
        	id /= 10;
        	++count;
        }
        
        if(count == 10) {
        	return true;
        }else {
        	return false;
        }
	}
	
	public boolean castVote(int vote_count) { //checks the vote_count variable to see if 0 to allow to vote
		if(vote_count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean modifyUser(String lock_status) { //checks if the lock_status variable is 'unlocked' to allow modification of user
		if(lock_status == "unlocked") {
				return true;
		} else if(lock_status == "locked") {
			return false;
		} else {
			return false;
		}
	}
	
	public boolean viewProfile(String record_status) { //checks to see if the record is not empty
		if(record_status.isEmpty() == false) {
			return true;
		} else {
			return false;
		}
	}
}
