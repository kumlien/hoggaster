package se.kumliens.hoggaster.repo;

import java.util.Date;
import java.util.List;
import java.util.Set;

import se.kumliens.hoggaster.domain.MarketMessage;

public interface MarketMessageDAO {
	
	
	void store(MarketMessage message);
	
	void delete(Set<MarketMessage> messages);
	
	void deleteOlderThan(Date date);
	
	List<MarketMessage> findByInstrument(String instrument);
	
}
