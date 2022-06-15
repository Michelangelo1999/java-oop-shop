package jana60.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Prodotto iphone = new Prodotto("Apple", "IPhone 13", 1149.90, 22);
		Prodotto samsung = new Prodotto("samsung", "samsung S22", 1000, 22);
		Prodotto huawei = new Prodotto("huawei", "huawei P30", 700, 22);
		
		
        String[] listaProdotti = {"IPhone 13", "samsung S22", "huawei P30"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("scegli il prodotto da acquistare: ");
		for(int i = 0; i < listaProdotti.length; i++) {
			System.out.print(listaProdotti[i] + "  ");
		}
		
		String myProduct = scan.nextLine();
		
		System.out.println("FATTURA");
		
		if(myProduct.equalsIgnoreCase(listaProdotti[0])) {
			System.out.println("marca: " + iphone.marca);
			System.out.println("tipo prodotto: " + iphone.nome);
			System.out.println(iphone.fattura());
		}else if(myProduct.equalsIgnoreCase(listaProdotti[1])) {
			System.out.println("marca: " + samsung.marca);
			System.out.println("tipo prodotto: " + samsung.nome);
			System.out.println(samsung.fattura());
		}else if(myProduct.equalsIgnoreCase(listaProdotti[1])) {
			System.out.println("marca: " + huawei.marca);
			System.out.println("tipo prodotto: " + huawei.nome);
			System.out.println(huawei.fattura());
		}else {
			System.out.println("spiacenti, questo prodotto non è disponibile al momento!");
		}
		
		scan.close();
		

	}

}
