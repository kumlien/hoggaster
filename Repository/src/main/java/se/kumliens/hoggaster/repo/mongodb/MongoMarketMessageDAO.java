package se.kumliens.hoggaster.repo.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import se.kumliens.hoggaster.repo.MarketMessageDAO;

@Repository
public class MongoMarketMessageDAO implements MarketMessageDAO {
	
	@Autowired MongoOperations mongoDb;
}
