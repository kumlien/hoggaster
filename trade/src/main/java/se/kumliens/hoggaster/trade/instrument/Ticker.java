package se.kumliens.hoggaster.trade.instrument;

/**
 * http://en.wikipedia.org/wiki/Ticker_symbol
 * 
 * @author svante2
 */
public class Ticker implements InstrumentID {
	
	private Exchange exchange;
	
	private ISIN isin;

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public ISIN getIsin() {
		return isin;
	}

	public void setIsin(ISIN isin) {
		this.isin = isin;
	}
	
}
