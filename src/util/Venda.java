package util;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Venda {
    private int id;
    private Usuario usuario;
    private double valor;
    private List<Produto> produtos = new ArrayList<Produto>();
    private Date data = new Date(); //#####
    private String nomCliente;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", usuario=" + usuario + ", valor=" + valor + ", produtos=" + produtos + ", data="
				+ data + ", nomCliente=" + nomCliente + "]";
	}
    
    
    
}