package se.kumliens.hoggaster.repo.mongodb;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import se.kumliens.hoggaster.domain.MarketMessage;
import se.kumliens.hoggaster.repo.MarketMessageDAO;

public class TestMarketMessageDAO {
	
	public static void main(String... args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MarketMessageDAO dao = ctx.getBean(MarketMessageDAO.class);
		MarketMessage message = new MarketMessage();
		message.setDate(new Date());
		message.setInstrument("NAUR");
		message.setType("BUY");
		dao.store(message);
	}
}
