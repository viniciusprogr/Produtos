package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Scanner sc = new Scanner(System.in);
	
	List<Product> lista = new ArrayList<>();
	
	System.out.println("Entre com o numero de produtos:" );
	int n = sc.nextInt();
	
	for(int i = 1 ; i<= n ; i++) {
		System.out.println("Produto #"+i+":");
		
		System.out.println("Qual o tipo do produto (c/u/i):");
		char tipo = sc.next().charAt(0);
		
		System.out.println("nome:");
		String nome = sc.next();
		
		System.out.println("preco:");
		Double preco = sc.nextDouble();
		if(tipo == 'c') {
			lista.add(new Product(nome, preco));
		}
		else if (tipo == 'u') {
			System.out.println("Data da Fabricação");
			Date  datadefabricacao = sdf.parse(sc.next());
			lista.add(new UsedProduct(nome, preco, datadefabricacao));
		}
		else {	
			System.out.print("Customs fee: ");
			double taxaAlfandega = sc.nextDouble();
			lista.add(new ImportedProduct(nome, preco, taxaAlfandega));
		}
		
		System.out.println();
		System.out.println("etiqueta:");
		for (Product prod : lista) {
			System.out.println(prod.etiqueta());
		}
		
		
	}
			
			
			sc.close();
}
}
