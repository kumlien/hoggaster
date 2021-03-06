package se.kumliens.hoggaster.trade.instrument;

import java.util.List;

public interface Instrument {
	
	void addId(InstrumentID id);
	
	List<InstrumentID> getIds();
	
	void setName(String name);
	
	String getName();
	
	ISIN getIsin();
	
	void setIsin(ISIN isin);

}
