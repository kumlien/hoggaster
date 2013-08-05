package se.kumliens.hoggaster.trade.instrument;

public enum Exchange {
	
	
	NGM("Nordic Growth Market Equity"), 
	NDX("Nordic Derivatives Exchange"),
	OMX_CPH("OMX Copenhagen"),
	OMX_HEL("OMX Helsinki"),
	OMX_STO("OMX Stockholm"),
	BURGUNDY("Burgundy"),
	OSE("Oslo Börs"),
	OM_SE("OM Stock exchange");
	
	private final String name;
	public String getName() {
		return name;
	}
	private Exchange(String name) {
		this.name = name;
	}
}
