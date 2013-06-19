package se.kumliens.hoggaster.repo.mongodb;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.kumliens.hoggaster.domain.MarketMessage;
import se.kumliens.hoggaster.repo.MarketMessageDAO;
import se.kumliens.hoggaster.repo.MarketMessageRepo;

public class TestMarketMessageDAO {
	
	public static void main(String... args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MarketMessageDAO dao = ctx.getBean(MarketMessageDAO.class);
		MarketMessage message = new MarketMessage();
		message.setDate(new Date());
		message.setInstrument("NAUR");
		message.setType("BUY");
		dao.store(message);
		
		System.out.println("should be one: " + dao.findByInstrument("NAUR").size());
		
		dao.deleteOlderThan(new Date());
		System.out.println("should be zero: " + dao.findByInstrument("NAUR").size());
		
		dao.store(message);
		List<MarketMessage> mm = dao.findByInstrument("NAUR");
		dao.delete(new HashSet<MarketMessage>(mm));
		System.out.println("should be zero: " + dao.findByInstrument("NAUR").size());
		
		MarketMessageRepo repo = ctx.getBean(MarketMessageRepo.class);
		repo.save(message);
		mm = repo.findByInstrument("NAUR");
		System.out.println("should be one: " + dao.findByInstrument("NAUR").size());
		repo.delete(message);
		System.out.println("should be zero: " + repo.count());
	}
}
