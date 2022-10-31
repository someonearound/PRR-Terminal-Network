package prr.core.communication;

import prr.core.pricetable.PriceTable;
import prr.core.terminal.Terminal;

public class VoiceCommunication extends Communication {

	public VoiceCommunication(int key, Terminal sender, Terminal receiver) {
		super(key, sender, receiver);
		//TODO Auto-generated constructor stub
	}

	public double calculateCost(PriceTable priceTable) {
		return priceTable.getCost(this);
	}
	
}