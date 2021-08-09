package util;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Compra {
    private int id;
    private Usuario usuario;
    private double valor;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int status;
    private Date data;   //LocalDateTime
    private Date dataEntrega;
     
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
		
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	
	@Override
	public String toString() {
		return "Compra [id=" + id + ", usuario=" + usuario + ", valor=" + valor + ", produtos=" + produtos + ", status="
				+ status + ", data=" + data + ", dataEntrega=" + dataEntrega + "]";
	}
	
    
    
}