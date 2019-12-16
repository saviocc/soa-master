package br.com.accenture.npc;

public class DuduMath {
	
	public static double caluloIMC( double peso, double altura )  {
		return peso / ( altura * altura ) ;
	}
	
	public static void main(String[] args) {
		double peso = 103;
		double altura = 1.74;
		double imc;
		
		imc = caluloIMC( peso, altura );
		
		if( imc <= 17 ) {
			System.out.println("Muito abaixo do peso");
		}
		else if( imc <= 18.49 ) {
			System.out.println("Abaixo do peso");
		}
		else if( imc <= 24.99 ) {
			System.out.println("Peso normal");
		}
		else if( imc <= 29.99 ) {
			System.out.println("Acima do peso");
		}
		else if( imc <= 34.99 ) {
			System.out.println("Obesidade I");
		}
		else if( imc <= 39.99 ) {
			System.out.println("Obesidade II (severa)");
		}
		else {
			System.out.println("Obesidade III (mórbida)");
		}		

	}
}
