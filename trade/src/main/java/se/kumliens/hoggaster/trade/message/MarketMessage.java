package se.kumliens.hoggaster.trade.message;

import java.util.HashMap;
import java.util.Map;

public class MarketMessage {
	
	
	private final Map<ElementType, Object> elements = new HashMap<ElementType, Object>();
	
	public void addElement(ElementType type, Object value) {
		elements.put(type, value);
	}
	
	public Object get(ElementType type) {
		return elements.get(type);
	}
}
