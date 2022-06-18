package java;
import java.util.Scanner;
import javax.security.sasl.SaslClient;

public class principal {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		double cotDolar, valorDolar, valReal, cotReal,var,valorRE,valoresif;
		String resp ;
		System.out.println("[1]conversor Iene Real: ");
		System.out.println("[2] conversor Euro Real:");
		System.out.print("[3] conversor Dolar Real: ");
		valoresif = entrada.nextDouble();
		if(valoresif <=3) {
			
			for(int i = 0;i<=2 ; i++) {
				if(valoresif == 1 ) {
					System.out.println("conversor Iene Real: ");
					System.out.println("[1] Iene para Real.");
					System.out.print("[2] Real para Iene: ");
					
					var = entrada.nextDouble();
					System.out.println();
						if(var == 1) {
							cotDolar = 0.038;
							System.out.print("Insira o valor em Ienes: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal*cotDolar;
							System.out.println("você tem "+valorDolar+ " reais");
							System.out.println();
							break;
							
							
						
						}
						else if (var == 2) {
							cotDolar = 0.038;
							System.out.print("Insira o valor em Reais: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal/cotDolar;
							System.out.println("você tem "+valorDolar+ " Ienes");
							break;
						}
						else {
							System.out.println("valor invalido.");
							
						}
				}
				
				else if (valoresif == 2) {
					
					
					
					System.out.println("conversor Euro Real: ");
					System.out.println("[1] Euro para Real.");
					System.out.print("[2] Real para Euro: ");
					
					var = entrada.nextDouble();
					
						if(var == 1) {
							cotDolar = 5.41;
							System.out.print("Insira o valor em Euro: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal*cotDolar;
							System.out.println("você tem "+valorDolar+ " reais");
							System.out.println();
							break;
							
						
						}
						else if (var == 2) {
							cotDolar = 5.41;
							System.out.print("Insira o valor em Reais: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal/cotDolar;
							System.out.println("você tem "+valorDolar+ " Euro");
							break;
						}
						else {
							System.out.println("valor invalido.");
						}
				}
				
				
					
				else if (valoresif == 3) {
					System.out.println("conversor Dolar Real: ");
					System.out.println("[1] Dolar para Real.");
					System.out.print("[2] Real para dolar: ");
					
					var = entrada.nextDouble();
					
						if(var == 1) {
							cotDolar = 5.15;
							System.out.print("Insira o valor em dolar: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal*cotDolar;
							System.out.println("você tem "+valorDolar+ " reais");
							System.out.println();
							break;
							
						}
						else if (var == 2) {
							cotDolar = 5.15;
							System.out.print("Insira o valor em Reais: ");
							valReal = entrada.nextDouble();
							valorDolar = valReal/cotDolar;
							System.out.println("você tem "+valorDolar+ " dolar");
							break;
						}
						else {
							System.out.println("valor invalido.");
						}
				}
				
				
					System.exit(1);
				
			}
			
		}

	}
				
			
}
