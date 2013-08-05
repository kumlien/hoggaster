package se.kumliens.hoggaster.trade.instrument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractInstrument implements Instrument {
	
	private ISIN isin;
	
	private String name;
	
	private List<InstrumentID> instrumentIDs = new ArrayList<InstrumentID>();

	@Override
	public void addId(InstrumentID id) {
		instrumentIDs.add(id);
	}

	@Override
	public List<InstrumentID> getIds() {
		return Collections.unmodifiableList(instrumentIDs);
	}


	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ISIN getIsin() {
		return isin;
	}

	@Override
	public void setIsin(ISIN isin) {
		this.isin = isin;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isin == null) ? 0 : isin.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		AbstractInstrument other = (AbstractInstrument) obj;
		if (isin == null) {
			if (other.isin != null) {
				return false;
			}
		} else if (!isin.equals(other.isin)) {
			return false;
		}
		return true;
	}

}
