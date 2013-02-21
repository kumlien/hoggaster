package se.kumliens.hoggaster.trade.instrument.impl;

import se.kumliens.hoggaster.trade.instrument.Instrument;



/**
 * Abstract class for all derivatives
 * 
 * @author svante2
 */
public abstract class Derivative {
	
	private Instrument underlyingInstrument;

	public void setUnderlyingInstrument(Instrument instrument) {
		this.underlyingInstrument = instrument;
	}
	
	public Instrument getUnderlyingInstrument() {
		return underlyingInstrument;
	}
}
