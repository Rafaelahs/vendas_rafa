package util;

public class Cliente extends Pessoa {
	protected int cupomDesconto;
	protected int pontos;
	
	public int getCupomDesconto() {
		return cupomDesconto;
	}
	public void setCupomDesconto(int cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	@Override
	public String toString() {
		return "Cliente [cupomDesconto=" + cupomDesconto + ", pontos=" + pontos + "]";
	}
	
	
}
