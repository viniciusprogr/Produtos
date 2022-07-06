package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date DataDeFrabicacao;
	


	public UsedProduct(String nome, Double preco, Date dataDeFrabicacao) {
		super(nome, preco);
		DataDeFrabicacao = dataDeFrabicacao;
	}

	public Date getDataDeFrabicacao() {
		return DataDeFrabicacao;
	}

	public void setDataDeFrabicacao(Date dataDeFrabicacao) {
		DataDeFrabicacao = dataDeFrabicacao;
	}
	
	@Override
	public String etiqueta() {
		return getNome() 
				+ " (used) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+ sdf.format(DataDeFrabicacao)
				+ ")";
	
	}
	
	
	
}
