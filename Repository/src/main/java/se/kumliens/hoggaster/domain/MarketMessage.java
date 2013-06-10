package se.kumliens.hoggaster.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MarketMessage {
	
	@Id
	private String id;
}
