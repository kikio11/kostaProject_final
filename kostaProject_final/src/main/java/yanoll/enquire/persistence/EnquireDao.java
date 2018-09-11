package yanoll.enquire.persistence;

import yanoll.enquire.domain.Enquire_Board;

public interface EnquireDao {
	
	public void create(Enquire_Board board)throws Exception;

}
