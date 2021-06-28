/*Fazer um programa para ler um n�mero inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura m�dia dessas pessoas.*/


package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; // criando vetor com [] o N � a contidade passada pelo usuario.
		for(int i = 0 ; i < n; i++) { //para gaurda os valores utilizamos o For
			vect[i] = sc.nextDouble(); 
		}
		double soma = 0;
		for(int i = 0; i<n; i++) { // pecorre o vetor e acumula os valores.
			soma += vect[i];
		}
		double media = soma / n; // fazendo a media
		
		System.out.printf("AVERAGE HEIHT: %.2f%n", media);
		
		
		
		sc.close();

	}

}
