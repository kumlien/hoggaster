package se.kumliens.hoggaster.repo.mongodb;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import se.kumliens.hoggaster.domain.MarketMessage;
import se.kumliens.hoggaster.repo.MarketMessageDAO;
import se.kumliens.hoggaster.repo.MarketMessageRepo;

@Repository
public class MongoMarketMessageDAO implements MarketMessageDAO {
	
	@Autowired MongoOperations mongoDb;
	
	@Autowired MarketMessageRepo repo;

	@Override
	public void store(MarketMessage message) {
		mongoDb.save(message);
	}


	@Override
	public void delete(Set<MarketMessage> messages) {
		Set<String> ids = new HashSet<String>();
		for(MarketMessage message : messages) {
			ids.add(message.getId());
		}
		Query query = new Query(Criteria.where("_id").in(ids));
		mongoDb.remove(query, MarketMessage.class);
		
	}

	@Override
	public List<MarketMessage> findByInstrument(String instrument) {
		Query query = new Query(Criteria.where("instrument").is(instrument));
		return mongoDb.find(query, MarketMessage.class);
	}


	@Override
	public void deleteOlderThan(Date date) {
		Query query = new Query(Criteria.where("date").lt(date));
		mongoDb.remove(query, MarketMessage.class);
	}
}
