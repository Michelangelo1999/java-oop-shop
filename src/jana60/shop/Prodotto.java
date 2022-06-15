package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {
	
	String marca;
	String nome;
	double prezzo;
	int percIva;
	
	Prodotto(String marca, String nome, double prezzo, int percIva){
		this.marca = marca;
		this.nome = nome;
		this.prezzo = prezzo;
		this.percIva = percIva;
	}
	
	double calcolaPrezzoTot(){
		return prezzo+(prezzo/100)*percIva;
	}
	
	String fattura() {
		DecimalFormat df = new DecimalFormat(".00");
		return "Costo complessivo: €" + df.format(this.calcolaPrezzoTot());
	}

}
