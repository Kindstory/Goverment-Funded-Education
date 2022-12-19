package generics;

import inheritance.Water;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderWhat = new GenericPrinter<Powder>();
		
		powderWhat.setMaterial(new Powder());
		Powder powder = powderWhat.getMaterial();
		System.out.println(powderWhat.hiIamsandy());
		System.out.println();
		powder.doPrinting();
		System.out.println();
		System.out.println(powderWhat.hiIamsandy() + ", " + powder.toString());
		System.out.println();
		powderWhat.hiIamBen();
		System.out.println();
		System.out.println(powderWhat.toString());
		System.out.println();
		
//		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
//		
//		plasticPrinter.setMaterial(new Plastic());
//		Plastic plastic = plasticPrinter.getMaterial();
//		System.out.println(plasticPrinter);
//		System.out.println();
//	
//		plasticPrinter.hiIamBen();
//		System.out.println();
		
		GenericPrinter<Water> waterPrint = new GenericPrinter<Water>();
		waterPrint.setMaterial(new Water());
		Water water = waterPrint.getMaterial();    
		System.out.println(waterPrint);
		System.out.println();
		
		System.out.println(waterPrint.hiIamsandy());
		System.out.println();
		waterPrint.hiIamBen();
		
	}

}
