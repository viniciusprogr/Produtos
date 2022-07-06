package entities;

public class ImportedProduct extends Product {
	
	private Double TaxaAlfandega;

	public ImportedProduct(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		TaxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return TaxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		TaxaAlfandega = taxaAlfandega;
	}
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " $ "
				+ getPreco()
				+"(TAXA ; $ "+TaxaAlfandega+")"
				;
	}
	public Double totalPrice() {
		return getPreco() + TaxaAlfandega;
	}
	
	
	
	
	
	

}
