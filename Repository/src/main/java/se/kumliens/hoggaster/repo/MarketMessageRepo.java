package se.kumliens.hoggaster.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import se.kumliens.hoggaster.domain.MarketMessage;

public interface MarketMessageRepo extends CrudRepository<MarketMessage, String> {
	
	List<MarketMessage> findByInstrument(String instrument);

}
