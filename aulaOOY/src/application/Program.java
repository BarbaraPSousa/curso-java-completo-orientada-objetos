package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);				
		
		Employee f1,f2;
		f1 = new Employee();
		f2 = new Employee();
		
		System.out.println("Dado primeiro funcionario: ");
		f1.name = sc.next();
		f1.valorPorHora = sc.nextDouble();
		f1.horas = sc.nextInt();
		
		System.out.println();
		System.out.println("Dado segundo funcionario: ");
		f2.name = sc.next();
		f2.valorPorHora = sc.nextDouble();
		f2.horas = sc.nextInt();
		
		double total = f1.total() + f2.total();
		
		System.out.printf("Total = %.2f", total);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
