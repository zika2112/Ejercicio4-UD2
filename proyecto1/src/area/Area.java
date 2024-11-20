package area;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el radio de un círculo: ");
		double radio = entrada.nextDouble();
		
		double area = Math.PI * radio * radio;
		double longitud = 2*Math.PI*radio;
		entrada.close();
		
		System.out.println("La longitud es " + longitud + " y el área " + area);
	}

}




