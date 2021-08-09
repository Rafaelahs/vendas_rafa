package util;

/*Essa classe produto vai ser usado listas e servirá para todos os objetos de instancias
 * de compra e venda*/
	public class Produto  {
	    
		public String nomProd;
	    public int codBar;
	    public float precoVen;
	    private float precoCus;
	    private int qntEst;
	    public String tipoUn;
	    public String categoria;

	    
	    
		public Produto(String nomProd, int codBar, double d, double e, int qntEst, String tipoUn,
				String categoria) {
			super();
			this.nomProd = nomProd;
			this.codBar = codBar;
			this.precoVen = (float) d;
			this.precoCus = (float) e;
			this.qntEst = qntEst;
			this.tipoUn = tipoUn;
			this.categoria = categoria;
		}
	    
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
			result = prime * result + codBar;
			result = prime * result + ((nomProd == null) ? 0 : nomProd.hashCode());
			result = prime * result + Float.floatToIntBits(precoCus);
			result = prime * result + Float.floatToIntBits(precoVen);
			result = prime * result + qntEst;
			result = prime * result + ((tipoUn == null) ? 0 : tipoUn.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			if (categoria == null) {
				if (other.categoria != null)
					return false;
			} else if (!categoria.equals(other.categoria))
				return false;
			if (codBar != other.codBar)
				return false;
			if (nomProd == null) {
				if (other.nomProd != null)
					return false;
			} else if (!nomProd.equals(other.nomProd))
				return false;
			if (Float.floatToIntBits(precoCus) != Float.floatToIntBits(other.precoCus))
				return false;
			if (Float.floatToIntBits(precoVen) != Float.floatToIntBits(other.precoVen))
				return false;
			if (qntEst != other.qntEst)
				return false;
			if (tipoUn == null) {
				if (other.tipoUn != null)
					return false;
			} else if (!tipoUn.equals(other.tipoUn))
				return false;
			return true;
		}
		public String getNomProd() {
			return nomProd;
		}
		public void setNomProd(String nomProd) {
			this.nomProd = nomProd;
		}
		public int getCodBar() {
			return codBar;
		}
		public void setCodBar(int codBar) {
			this.codBar = codBar;
		}
		public float getPrecoVen() {
			return precoVen;
		}
		public void setPrecoVen(float precoVen) {
			this.precoVen = precoVen;
		}
		public float getPrecoCus() {
			return precoCus;
		}
		public void setPrecoCus(float precoCus) {
			this.precoCus = precoCus;
		}
		public int getQntEst() {
			return qntEst;
		}
		public void setQntEst(int qntEst) {
			this.qntEst = qntEst;
		}
		public String getTipoUn() {
			return tipoUn;
		}
		public void setTipoUn(String tipoUn) {
			this.tipoUn = tipoUn;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}


  

} 
   
