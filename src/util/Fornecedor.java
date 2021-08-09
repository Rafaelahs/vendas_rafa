package util;

public class Fornecedor extends Pessoa  {
   	
	protected String brinde;

	public String getBrinde() {
		return brinde;
	}

	public void setBrinde(String brinde) {
		this.brinde = brinde;
	}

	@Override
	public String toString() {
		return "Fornecedor [brinde=" + brinde + "]";
	}
	 
	
}