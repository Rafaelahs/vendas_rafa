package util;

import java.util.Date;

public abstract class Data {
 
    public abstract Date dataAtual();
    public abstract Date dataEntrega();
    
    
    @Override
	public String toString() {
		return "Data [dataAtual()=" + dataAtual() + ", dataEntrega()=" + dataEntrega() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}  
    
}
